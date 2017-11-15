// Simple class describing an integer value 

public class Number {

	// Fields
	public int val;
	
	// Methods
	//
	// Constructor 
	public Number( int val ) 
	{
		// Assign input parameter to instance variable
		this.val = val;
	}
	
	// Getters/setters
	public int getVal() 
	{
		return val;
	}
	public void setVal(int val) 
	{
		this.val = val;
	}

	// toString method
	public String toString() 
	{
		// Use Integer wrapper toString method to convert to String
		return Integer.toString(val);
	}
}
