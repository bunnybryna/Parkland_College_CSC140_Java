package lab11Pack;

public class MonetaryCoin extends Coin{

    private int value;
    
    // constructor
    public MonetaryCoin(int theValue)
    {
        value = theValue;
    }
    
    public int getValue()
    {
        return value;
    }    
    
    // no need to override flip and toString method
}
