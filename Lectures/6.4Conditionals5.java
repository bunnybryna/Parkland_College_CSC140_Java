import java.util.ArrayList;


public class Conditionals5 {

	public static void main(String[] args) {

		// for loop
		//
		// The "for" loop is ideal when we have statements we'd
		// like to repeat a specific number of times. For example,
		// suppose we'd like to print values that double for 10 times
		// in increasing order. 
		int limit = 10;
		double val = 1.0;
		for(int i = 1; i <= limit; ++i)
		{
			System.out.println(val);
			val *= 2;
		}
		
		// Instead of the loop above, a more common convention is to
		// initialize the loop counter to zero and use the condition 
		// to check if it is less than the number of times you'd like to 
		// repeat the statements (instead of using <=) as shown below
		val = 1.0;
		for(int i = 0; i < limit; ++i)
		{
			System.out.println(val);
			val *= 2;
		}
		
		// We can also use the increment section of the for loop
		// to decrement. Suppose we'd like to print a count-down.
		// Note below how we can actually use the loop counter
		// (the variable "i") in the loop
		System.out.println("Countdown:");
		for(int i = 10; i > 0; --i)
			System.out.println("\tt minus " + i);
		System.out.println("Blast off!");
		
		// We can also nest for loops
		// Suppose we'd like to print a character in a grid
		// pattern with a specified number of rows and columns
		int nrows = 4;
		int ncols = 6;
		for(int i = 0; i < nrows; ++i)
		{
			for(int j = 0; j < ncols; ++j)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		// for-each loop
		//
		// for-each loops are useful to iterate through a collection 
		// of class objects. Recall we were introduced to the ArrayList.
		// Let's first load up an ArrayList of String objects as follows
		ArrayList<String> strings = new ArrayList<String>();
		for(int i = 0; i < 10; ++i)
			strings.add("String " + i);
		
		// We can now use a for-each loop to cycle through each
		// String object in the ArrayList as follows
		for(String s : strings)
			System.out.println(s);
	}
}
