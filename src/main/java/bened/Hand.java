package bened;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public void add(Card card) {
        int index = 0;
        boolean done = false;
        while (!done && index < cards.size()) {
            Card cardInHand = cards.get(index);
            if (card.isGreaterThan(cardInHand)) {
                index++;
            } else {
                done = true;
            }
        }
        cards.add(index, card);
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            //
            //
            //
            if (i > 0) {
                Card priorCard = cards.get(i-1);
                char priorSuit = priorCard.getSuit();
                char currentSuit = card.getSuit();
                if (priorSuit != currentSuit) {
                    string += " ";
                }
            }
            string += card.toString() + " ";
        }
        return string;
    }

    public void remove (Card card) {
        int index = 0;
        boolean found = false;
        while (!found && index < cards.size()) {
            Card compareCard = cards.get(index);
            if (compareCard.equals(card)) {
                cards.remove(index);
                found = true;
            } else {
                index++;
            }
        }
    }

    public boolean contains (Card card) {
        int index = 0;
        boolean contains = false;
        while (!contains && index < cards.size()) {
            Card compareCard = cards.get(index);
            if (compareCard.equals(card)) {
                contains = true;
            } else {
                index++;
            }
        }
        return contains;
    }

    public Card cardAt(int i) {
        return cards.get(i);
    }

    public int size() {
        return cards.size();
    }
}