/* 
Writing Classes

Step 1:
-------
Let's design a class that adds two integer numbers together.
We start by designing our class using a table with two columns
On the left we list the attributes of our class and on the right 
we list the operations of our class. The attributes are what the 
class "knows" and the operations are what the class "does". 
This is how we begin the design of any class we write. Note we
use name our class using an uppercase first letter by convention

				  Adder
	-----------------------------------
	"knows"			|		"does
	-----------------------------------
	first number	|	adds numbers, returns result
	second number	|	
					|	gets the first
					|	gets the second
					|	sets the first
					|	sets the second
					|
					|	returns a String description of the class	
	
Step 2:
-------
Next we identify what variable types we can use to store
what the class "knows" about. In our case, since we are adding
two integers, we'll identify integer variable types and actual
variable names with the first and second number. Next, we identify 
how we can convert each listing of what our class "does" into a method.
To accomplish this we need to think about what information is
sent to the method and what information is returned from the
method. Below is our second step. Note we use lowercase first
letters for our variables and the first part of our methods
and an uppercase first letter for any second part of our methods
by convention.
 
				  Adder
	-----------------------------------
	"knows"			|		"does
	-----------------------------------
	int first		|	int add();
	int second		|	
					|	int getFirst();
					|	int getSecond();
					|	void setFirst(int);
					|	void setSecond(int);
					|
					|	String toString();	

The "get" and "set" methods and "toString" methods above
are methods we will include in every class we design. The
get and set methods (also known as getters and setters) 
simply return and set the values of each of the attribute
variables we define in the left-hand side of the column.
The "toString" method is a method that returns a String
that lists the values of the attributes (which is also
called the "state" of an object created from this class.

Step 3:
-------
The last step is to implement this class with actual
code in our class shown below.
*/

public class Adder {

	// Here we write the attributes, or what 
	// the class "knows". We use a keyword "private"
	// which means that only methods in this class
	// have direct access to these variables.
	// We also call these variables "fields"
	private int first;
	private int second;
	
	
	// Here we first write a constructor method
	// that will execute when an object of this
	// class is created with the "new" operator.
	// Typically, this is where we initialize our 
	// attributes. Note this method does not have
	// a return type and is named using the exact
	// same name as the class.
	Adder()
	{
		first = 0;
		second = 0;
	}
	
	// Next, we'll write the actual method to
	// add the two numbers together and return
	// the result. We use a keyword "public"
	// which means this can be executed by both
	// methods of this class as well as objects
	// created from this class.
	public int add()
	{
		int sum = first + second;
		return sum;
	}

	// Next, we'll write our getters and setters.
	// These methods allow objects created from
	// this class to return and change values
	// of our attributes for this class
	public int getFirst()
	{
		return first;
	}
	public int getSecond()
	{
		return second;
	}
	public void setFirst(int i)
	{
		first = i;
	}
	public void setSecond(int i)
	{
		second = i;
	}
	
	// Lastly, we write a method that returns
	// a description of the "state" of an object
	// created from this class as a String
	public String toString()
	{
		String result;
		result = "First: " + first + "\n" + "Second: " + second;
		return result;
	}
}
