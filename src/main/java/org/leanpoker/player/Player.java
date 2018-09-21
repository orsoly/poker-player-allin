package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Original Roulette Banking Victorious Clan";

    public static int betRequest(JsonElement request) {
        Hand hand = new Hand();
        getCard(request, hand);
        if (hand.flush() || hand.fullHouse() || hand.fourOfAKind() || hand.straightFlush() || hand.royalStraightFlush()) {
            return 10000;
        }
        if (hand.pair() || hand.twoPair() || hand.threeOfKind() || hand.straight()) {
            return 3827;
        }
        if (hand.highestCard().ordinal() >= CardValue.N10.ordinal()) {
            return 1000;
        }
        return 0;
    }

    public static void getCard(JsonElement request, Hand hand) {
        for(int i=0; i<2; i++) {
            String rank = request.getAsJsonObject().getAsJsonArray("players").get(1).getAsJsonObject().getAsJsonArray("hole_cards").get(i).getAsJsonObject().get("rank").getAsString();
            String suit = request.getAsJsonObject().getAsJsonArray("players").get(1).getAsJsonObject().getAsJsonArray("hole_cards").get(i).getAsJsonObject().get("suit").getAsString();
            Card card = new Card(rank, suit);
            putIntoHand(hand, card);
        }
        for (int i=0; i<request.getAsJsonObject().getAsJsonArray("community_cards").size(); i++) {
            String rank = request.getAsJsonObject().getAsJsonArray("community_cards").get(i).getAsJsonObject().get("rank").getAsString();
            String suit = request.getAsJsonObject().getAsJsonArray("community_cards").get(i).getAsJsonObject().get("suit").getAsString();
            Card card = new Card(rank, suit);
            putIntoHand(hand, card);
        }
    }


    public static void putIntoHand(Hand h, Card c) {
        h.add(c);
    }

    public static void showdown(JsonElement game) {
    }
}
