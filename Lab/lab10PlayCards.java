package lab10Pack;



public class PlayCards {

	public static void main(String[] args) {
		//Card c = new Card(1, Suit.Spade);
		//System.out.println(c);
		DeckOfCards deck = new DeckOfCards();
		
		//System.out.println(deck);
		deck.shuffle();
		//System.out.println(deck);


		for (int i=0;i<52;++i)
		{
			System.out.println("Number " + (i + 1) + " card :");
			deck.deal();
			System.out.println((51 - i) + " cards left.");
		}
		System.out.println("Finish dealing.");
	}

}
