public class Main {
    public static void main(String[] args) {


        Card card = new Card(Suit.DIAMONDS,10);
        Card card2 = new Card(Suit.SPADES,12);

        System.out.println(card.beats(card2));

    }
}