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
    public void add(Card card)
    {
        this.deck.add(card);
    }

    public boolean pair() {

        return true;
    }

    public boolean twoPair() {

        return true;
    }

    public boolean threeOfKind() {

        return true;
    }

    public boolean straight() {

        return true;
    }

    public boolean flush() {

        return true;
    }

    public boolean fullHouse() {

        return true;
    }

    public boolean fourOfAKind() {


        return true;
    }

    public boolean straightFlush() {


        return true;
    }

    public boolean royalStraightFlush() {

        return true;
    }
}
