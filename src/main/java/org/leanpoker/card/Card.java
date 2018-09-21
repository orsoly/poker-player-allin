package org.leanpoker.card;

import com.google.gson.JsonElement;

import java.util.Map;


enum CardColor
{
    CLUB, DIAMIOND, HEART, SPADE
}

enum CardValue
{
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
}

public class Card
{
    private CardColor col;
    private CardValue val;

    public Card(CardColor col, CardValue val)
    {
        this.col = col;
        this.val = val;
    }
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
}

