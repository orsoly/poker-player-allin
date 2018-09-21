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
    /*public Card(String rank, String suit)
    {
        if(rank.equals("J"))
        {
            this.col = 
        }
    }*/
    CardColor getColor()
    {
        return this.col;
    }
    CardValue getValue()
    {
        return this.val;
    }
    void setColor(CardColor col)
    {
        this.col = col;
    }
    void setValue(CardValue val)
    {
        this.val = val;
    }

    @Override
    public int compareTo(Card other)
    {
        return Integer.compare(this.val.ordinal(), other.val.ordinal());
    }
}

