
package lab10Pack;


enum Suit{Spade, Heart, Club, Diamond} 

public class Card {
    // knows
    private int myRank;
    private Suit mySuit;
    
    // constructor
    public Card(int r, Suit s)
    {
        myRank = r;
        mySuit = s;
    }
    // default
    public Card()
    {
    	myRank = 0;
    	mySuit = Suit.Heart;
    }
    
    // setters and getters
    public void setRank(int r)
    {
        myRank = r;
    }
    public void setSuit(Suit s)
    {
        mySuit = s;
    }
    public int getRank()
    {
        return myRank;
    }
    public int getSuit()
    {
        return mySuit.ordinal();
    }
    
    public String toString()
    {
        String result = mySuit.name() + " ";
        switch(myRank)
        {
        	case 1:
        		result += "A";
        		break;
        	case 11:
        		result += "J";
        		break;
        	case 12:
        		result += "Q";
        		break;
        	case 13:
        		result += "K";
        		break;
        	default:
        		result += myRank;
        	
        }
        return result;
    }
    

}

