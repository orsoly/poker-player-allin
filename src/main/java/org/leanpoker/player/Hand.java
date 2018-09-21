package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

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

    public CardValue highestCard() {
        Card highest = null;
        
        for ( Card card : deck ) {
            if ( highest == null ) {
                highest = card;
            }
            else if ( card.compareTo(highest) > 0 ) {
                highest = card;
            }
        }

        return highest.getValue();
    }

    public boolean pair() {
        for (Card card : deck) {
            for (Card anotherCard : deck) {
                if ( card.equals(anotherCard) ) { continue; }
                if ( (card.getValue()).equals(anotherCard.getValue()) ) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean hasPairAndRemove(ArrayList<Card> deck) {
        for (Card card : deck) {
            for (Card anotherCard : deck) {
                if ( card.equals(anotherCard) ) { continue; }
                if ( (card.getValue()).equals(anotherCard.getValue()) ) {
                    deck.remove(card);
                    deck.remove(anotherCard);
                    return true;
                }
            }
        }

        return false;

    }


    public boolean twoPair() {
        ArrayList<Card> localDeck = new ArrayList<>();
        for (Card card : deck) {
            localDeck.add(card);
        }
        
        boolean hasOnePair = hasPairAndRemove(localDeck);        
        if ( hasOnePair ) {
            return hasPairAndRemove(localDeck);
        }

        return false;
    }

    public boolean threeOfKind() {
        for (Card firstCard : deck) {
            for (Card secondCard : deck) {
                for (Card thirdCard : deck) {
                    if ( firstCard.equals(secondCard) || secondCard.equals(thirdCard) || firstCard.equals(thirdCard) ) { continue; }
                    if ( (firstCard.getValue()).equals(secondCard.getValue()) && (secondCard.getValue()).equals(thirdCard.getValue()) ) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean straight() {
        ArrayList<Integer> values = new ArrayList<>();
        
        for ( int i = 0; i < deck.size(); ++i ) {
            values.add(deck.get(i).getValue());
        }

        Collections.sort(values);
        if ( deck.size() < 5 ) { return false; }
        for ( int i = 0; i < deck.size() - 5; ++i ) {
            if ( (deck.get(i).getValue()) == (deck.get(i + 1).getValue() - 1) == (deck.get(i + 2).getValue() - 2) == (deck.get(i + 3).getValue() - 3) == (deck.get(i + 4).getValue() - 4) ) {
                return true;
            }
        }

        return false;
    }

    public boolean flush() {

        return false;
    }

    public boolean fullHouse() {

        return false;
    }

    public boolean fourOfAKind() {


        return false;
    }

    public boolean straightFlush() {


        return false;
    }

    public boolean royalStraightFlush() {

        return false;
    }
}
