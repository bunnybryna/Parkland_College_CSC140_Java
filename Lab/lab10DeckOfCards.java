package lab10Pack;

public class DeckOfCards {
    // knows
    private Card[] cards;
    private int count;

    // constructor
    public DeckOfCards()
    {
        cards = new Card[52];
        for (int i=0;i<cards.length;++i)
        {
            cards[i] = new Card();
        }
        for (int i=0;i<cards.length;++i)
        {
            // rank from 1 to 13
            int rank = i % 13 + 1;
            // suit from 1 to 4 corresponding to enum.ordinal() 
            int suit = i / 13 + 1;
            cards[i].setRank(rank);

            switch (suit)
            {
                case 1:
                    cards[i].setSuit(Suit.Spade);
                    break;
                case 2:
                    cards[i].setSuit(Suit.Heart);
                    break;
                case 3:
                    cards[i].setSuit(Suit.Club);
                    break;
                case 4:
                    cards[i].setSuit(Suit.Diamond);  
                    break;
            }
            
        }
        count = cards.length;
    }
    
    public void shuffle()
    {
    	for (int i=0;i<cards.length;++i)
    	{
    		int index = (int)(Math.random() * cards.length);
    		Card temp = cards[i];
    		cards[i] = cards[index];
    		cards[index] = temp;
    	}
    }
    
    public void deal()
    {
    	// it's more complicate to resize array
    	// make it easier, jut print the one from top 
    	System.out.println(cards[count-1]);
    	count -= 1;
    }
    
    
    public String toString()
    {
    	String result="";
    	for (Card card: cards)
    	{
    		result += card.toString();
    		result += " ";
    	}
    	return result;
    }
        
	
}

