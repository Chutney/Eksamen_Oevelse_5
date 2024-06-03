import java.util.ArrayList;
import java.util.Random;

public class Card {

    private Suit suit;
    private int value;
    private Random rand;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }


    public boolean beats(Card card) {
        if(card.getSuit().powerLevel > suit.powerLevel) {
            return false;
        } else if(card.getSuit().powerLevel < suit.powerLevel) {
            return true;
        } else {
            return card.getValue() <= value;

        }

    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }



}
