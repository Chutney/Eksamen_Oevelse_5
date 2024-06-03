public enum Suit {

    SPADES(4),
    HEARTS(3),
    DIAMONDS(2),
    CLUBS(1);

    final int powerLevel;

    Suit(int powerLevel) {
        this.powerLevel = powerLevel;
    }

}
