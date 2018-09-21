package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;


public class Card implements Comparable<Card>
{
    private CardColor col;
    private CardValue val;

    public Card(CardColor col, CardValue val)
    {
        this.col = col;
        this.val = val;
    }
    public Card(String rank, String suit)
    {
        if(rank.equals("J"))
        {
            this.val = CardValue.J;
        }
        else if(rank.equals("Q"))
        {
            this.val = CardValue.Q;
        }
        else if(rank.equals("K"))
        {
            this.val = CardValue.K;
        }
        else if(rank.equals("A"))
        {
            this.val = CardValue.A;
        }
        else if(rank.equals("2"))
        {
            this.val = CardValue.N2;
        }
        else if(rank.equals("3"))
        {
            this.val = CardValue.N3;
        }
        else if(rank.equals("4"))
        {
            this.val = CardValue.N4;
        }
        else if(rank.equals("5"))
        {
            this.val = CardValue.N5;
        }
        else if(rank.equals("6"))
        {
            this.val = CardValue.N6;
        }
        else if(rank.equals("7"))
        {
            this.val = CardValue.N7;
        }
        else if(rank.equals("8"))
        {
            this.val = CardValue.N8;
        }
        else if(rank.equals("9"))
        {
            this.val = CardValue.N9;
        }
        else
        {
            this.val = CardValue.N10;
        }

        this.col = CardColor.valueOf(suit);
    }
    public CardColor getColor()
    {
        return this.col;
    }
    public CardValue getValue()
    {
        return this.val;
    }
    public void setColor(CardColor col)
    {
        this.col = col;
    }
    public void setValue(CardValue val)
    {
        this.val = val;
    }

    @Override
    public int compareTo(Card other)
    {
        return Integer.compare(this.val.ordinal(), other.val.ordinal());
    }

    public String toString()
    {
        return "" + this.col.toString() + this.val.toString();
    }
}

