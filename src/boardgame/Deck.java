package boardgame;
import java.util.Arrays;
import java.util.Random;

public class Deck {
	Card[] cardArray = new Card[52];
	Random rand = new Random();
	Card tempHand;
	
	Deck(){	//constructor
		int suits = 4;
		int cardType = 13;
		int cardCount = 0;
		
		for(int i = 1; i <= suits; i++) {
			for(int j = 1; j <= cardType; j++){
				cardArray[cardCount] = new Card(i,j);
				cardCount++;
			}//end inner for j
		}//end out for i
	}//end constructor
		
	public void print() {
		for(int i=0; i<cardArray.length; i++) {
			System.out.println(cardArray[i]);
		}//end for i
	}//end method print
	
	public void shuffle() {
		for(int i=0; i<cardArray.length; i++) {
			int randomIndexToSwap = rand.nextInt(cardArray.length);
			 Card temp = cardArray[randomIndexToSwap];
			cardArray[randomIndexToSwap] = cardArray[i];
			cardArray[i] = temp;
		}//end for
	}//end method shuffle
	
	public Card getRandomCard() {
		int randomIndex = rand.nextInt(cardArray.length); 
		return cardArray[randomIndex];
	}
	
}//end class Deck
