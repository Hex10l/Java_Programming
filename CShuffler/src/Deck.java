import java.util.Random;
public class Deck {
    private Card[] deck;
    public Deck() {
        deck = new Card[52];
    }
    public void fill(){
        int index = 0;
        for(Character rank : Card.Rank){
            for (Character suit : Card.Suit){
                deck[index++] = new Card(rank, suit);
            }
        }
    }
    public void shuffle(){
        //Student Code | Randomizer
        /** Note: I saw in the video that the shuffle() method was left empty, so I assumed we were utilizing the other code as our starter Code */
        for (int i = 0; i < 52; i++){
            /** Goes through the entire deck and swaps each card with another in the deck */
            int randomNumber = new Random().nextInt(52);
            Card randomCard = deck[randomNumber];
            Card tempCard = deck[i];
            deck[i] = deck[randomNumber];
            deck[randomNumber] = tempCard;
        }
    }
    public String toString(){
        String result = "";
        for (Card card : this.deck){
            result += card.toString();
        };
        return result;
    }
}
