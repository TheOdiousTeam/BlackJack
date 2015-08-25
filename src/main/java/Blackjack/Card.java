package Blackjack;

public class Card {
	private static String ranks[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	private static String suits[] = {"Clubs","Spades","Diamonds","Hearts"};
	
	private int suit;
	public int getSuit() {
		return suit;
	}

	private int rank;
	public int getRank() {
		return rank;
	}

	public Card(int suit, int rank){
		this.suit = suit;
		this.rank = rank;
	}
	public String toString(){ //override toString method from Object 
		return ranks[this.rank] + "of" + suits[this.suit];
	}
	
	public String rankAsString(int rank){
		return ranks[rank];
	}
	public String suitAsString(int suit){
		return suits[suit];
	}
}
