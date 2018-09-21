package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Original Roulette Banking Victorious Clan";

    public static int betRequest(JsonElement request) {
        Hand hand = new Hand();
        getCard(request, hand);
        return 10000;
    }

    public static void getCard(JsonElement request, Hand hand) {
        for(int i=0; i<2; i++) {
            String rank = request.getAsJsonArray("players").get(1).getAsJsonArray("hole_cards").get(i).get("rank").getAsString();
            String suit = reguest.getAsJsonArray("players").get(1).getAsJsonArray("hole_cards").get(i).get("suit").getAsString();
            Card card = new Card(rank, suit);
            putIntoHand(hand, card);
        }
        for (int i=0; i<reguest.getAsJsonArray("community_cards").lenght(); i++) {
            reguest.getAsJsonArray("community_cards").get(i).get("rank").getAsString();
            reguest.getAsJsonArray("community_cards").get(i).get("suit").getAsString();
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
