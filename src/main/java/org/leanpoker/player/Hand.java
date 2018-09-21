package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;
import java.util.ArrayList;

public class Hand
{
    private ArrayList<Card> deck;

    public Hand()
    {
        this.deck = new ArrayList<Card>();
    }
    public Hand(ArrayList<Card> deck)
    {
        this.deck = new ArrayList<Card>(deck);
    }
    public add(Card card)
    {
        this.deck.add(card);
    }
}