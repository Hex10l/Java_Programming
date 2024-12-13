
public class Card {
    public static final Character Clubs = '♣';
    public static  final Character Spades = '♠';
    public static final Character Hearts = '♥';
    public static final Character Diamonds = '♦';
    public static Character[] Rank = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J','Q','K'};
    public static Character[] Suit = {Clubs, Spades, Hearts, Diamonds};

    public Character rank;
    public Character suit;
    public Card(){
        rank = Rank[0];
        suit = Suit[0];
    }

    public Card(Character rank, Character suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public String toString(){
        return suit + rank.toString() + " ";
    }
}


/** Assign Value to Heart Cards */
/*
public static void assignHeartCardValue() {
    int aceOfHearts = 1;
    int twoOfHearts = 2;
    int threeOfHearts = 3;
    int fourOfHearts = 4;
    int fiveOfHearts = 5;
    int sixOfHearts = 6;
    int sevenOfHearts = 7;
    int eightOfHearts = 8;
    int nineOfHearts = 9;
    int tenOfHearts = 10;
    int jackOfHearts = 11;
    int queenOfHearts = 12;
    int kingOfHearts = 13;
}*/
/** Assign Value to Club Cards */
/*
public static void assignClubCardValue() {
    int aceOfClubs = 1;
    int twoOfClubs = 2;
    int threeOfClubs = 3;
    int fourOfClubs = 4;
    int fiveOfClubs = 5;
    int sixOfClubs = 6;
    int sevenOfClubs = 7;
    int eightOfClubs = 8;
    int nineOfClubs = 9;
    int tenOfClubs = 10;
    int jackOfClubs = 11;
    int queenOfClubs = 12;
    int kingOfClubs = 13;
}*/
/** Assign Value to Diamond Cards */
/*
public static void assignDiamondCardValue() {
    int aceOfDiamond = 1;
    int twoOfDiamond = 2;
    int threeOfDiamond = 3;
    int fourOfDiamond = 4;
    int fiveOfDiamond = 5;
    int sixOfDiamond = 6;
    int sevenOfDiamond = 7;
    int eightOfDiamond = 8;
    int nineOfDiamond = 9;
    int tenOfDiamond = 10;
    int jackOfDiamond = 11;
    int queenOfDiamond = 12;
    int kingOfDiamond = 13;
}*/
/** Assign Value to Spade Cards */
/*
public static void assignSpadeCardValue() {
    int aceOfSpades = 1;
    int twoOfSpades = 2;
    int threeOfSpades = 3;
    int fourOfSpades = 4;
    int fiveOfSpades = 5;
    int sixOfSpades = 6;
    int sevenOfSpades = 7;
    int eightOfSpades = 8;
    int nineOfSpades = 9;
    int tenOfSpades = 10;
    int jackOfSpades = 11;
    int queenOfSpades = 12;
    int kingOfSpades = 13;
}*/