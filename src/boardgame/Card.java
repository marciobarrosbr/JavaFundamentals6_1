package boardgame;

public class Card {
	private String suit,name;
	private int points;
	
	//default constructor which initializes instances variables
	//numeric values are 0 (zero) and String values are "" (null)
	Card(){		
	}//end constructor
	
	//constructor that allows the setting of the initial values for Products
	Card(int n1, int n2){
		suit = getSuit(n1);  //um dos quatro modelos de carta(diamond,clubs,spades,hearts)
		name = getName(n2);  //nome da carta
		points = getPoints(name);
	}//end constructor Card
	
	//returns the current value of name
	public String getName(int i){
		if(i == 1) return "Ace";
		if(i == 2) return "Two";
		if(i == 3) return "Three";
		if(i == 4) return "Four";
		if(i == 5) return "Five";
		if(i == 6) return "Six";
		if(i == 7) return "Seven";
		if(i == 8) return "Eight";
		if(i == 9) return "Nine";
		if(i == 10) return "Ten";
		if(i == 11) return "Jack";
		if(i == 12) return "Queen";
		if(i == 13) return "King";
		return "error"; 
	}//end method getSuit 
	
	//returns the value of suit
	public String getSuit(int i){
		if(i == 1) return "Diamonds";
		if(i == 2) return "Clubs";
		if(i == 3) return "Spades";
		if(i == 4) return "Hearts";
		return "error";
	}//end method getSuit
	
	//method auxiliar pra apresentar dados
		public String toString(){
			 return "The " + name + " of " + suit;
		}//end method toString
		
	//returns the value points
	public int getPoints(String n){
		 if(n == "Jack" ||n == "Queen" ||n == "King"||n == "Ten")
			 return 10;
		 if(n == "Two")
			 return 2;
		 if(n == "Three")
			 return 3; 
		 if(n == "Four")
			 return 4;
		 if(n == "Five")
			 return 5;
		 if(n == "Six")
			 return 6;
		 if(n == "Seven")
			 return 7;
		 if(n == "Eight")
			 return 8;
		 if(n == "Nine")
			 return 9;
		 if(n == "Ace")
			 return 1;
		 
		 return -1;
	}//end method getPoints
	
}//end class Card
