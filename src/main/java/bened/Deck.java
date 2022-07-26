package bened;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();
    private Random rand = new Random();

    public Deck () {
        for (int i = 0; i < 52; i++) {
            Card card = new Card(i);
            cards.add(card);
        }
        shuffle();
    }

    public String toString() {
        String deckString = "";
        for (int i=0; i < cards.size(); i++) {
            Card card = cards.get(i);
            deckString += card + " ";
        }
        return deckString;
    }

    public void shuffle () {
        ArrayList<Card> shuffled = new ArrayList<Card>();
        int numberOfTimes = cards.size();
        for (int i = 0; i < numberOfTimes; i++) {
            int deckSize = cards.size();
            int pick = rand.nextInt(deckSize);
            Card card = cards.remove(pick);
            shuffled.add(card);
        }
        cards = shuffled;
    }

    public Card deal() {
        Card card = cards.remove(0);
        return card;
    }

    public void reuse(ArrayList<Card> newCards) {
        cards = newCards;
    }

    public int size() {
        return cards.size();
    }
}