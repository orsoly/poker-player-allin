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
    
    public static boolean isNext(Card prev, Card next) {
        return ( prev.val == CardValue.N2 && next.val == CardValue.N3 ) ||
        ( prev.val == CardValue.N3 && next.val == CardValue.N4 ) ||
        ( prev.val == CardValue.N4 && next.val == CardValue.N5 ) ||
        ( prev.val == CardValue.N5 && next.val == CardValue.N6 ) ||
        ( prev.val == CardValue.N6 && next.val == CardValue.N7 ) ||
        ( prev.val == CardValue.N7 && next.val == CardValue.N8 ) ||
        ( prev.val == CardValue.N8 && next.val == CardValue.N9 ) ||
        ( prev.val == CardValue.N9 && next.val == CardValue.N10 ) ||
        ( prev.val == CardValue.N10 && next.val == CardValue.J ) ||
        ( prev.val == CardValue.J && next.val == CardValue.Q ) ||
        ( prev.val == CardValue.Q && next.val == CardValue.K ) ||
        ( prev.val == CardValue.K && next.val == CardValue.A );
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

    @Override
    public boolean equals(Object other)
    {
        if(other == null)
            return false;
        if(other == this)
            return true;
        if(other instanceof Card)
        {
            Card temp = (Card)other;
            return this.col == temp.col && this.val == temp.val;
        }
        else return false;
    }
}

