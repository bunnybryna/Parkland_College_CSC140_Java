
public class Conditionals1 {

	public static void main(String[] args) {

		// Consider the example in the slides
		// Note that sum must be GREATER than MAX
		// to resolve to true. The condition will resolve
		// to false if it is LESS OR EQUAL to
		final int MAX = 10;
		int sum = 10;
		if(sum > MAX)
			System.out.println("Statement is true, sum > MAX");

		// Condition for GREATER than AND EQUAL to
		if(sum >= MAX)
			System.out.println("Statement is true, sum >= MAX");
		
		// Logical operator
		// Boolean variables are useful for testing and indicating
		// some state in your code. For example, you might want to
		// prompt a user for input until they are finished. When
		// they are finished, you can set the associated boolean.
		// You can read the 'if' statement as "If NOT done, then..."
		boolean done = false;
		if(!done)
			System.out.println("Continue getting input");
		
		
		// Note in following example from slides that
		// the arithmetic expression is evaluated first, 
		// then the conditions from left to right
		// This can be read as:
		// "if total is less than (MAX+5) AND found is false (or NOT found is true)"
		int total = 5;
		boolean found = false;
		if(total < MAX+5 && !found)
			System.out.println("total, MAX+5, found, !found: " + total + ", " + (MAX+5) + ", " + found + ", " + !found);

		// Example from slide
		// statement NOT execute if found is false and done is true
		// this results in (0 OR 0) which from our truth table is false
		boolean f = false;
		boolean d = true;
		if(f || !d)
			System.out.println("Ok");
		
		
		// if-else statement allows different statements to be processed
		// both if a condition is true and if a condition is false.
		// Note that in either case the statement following the if-else
		// is executed
		boolean c = true;
		if(c)
			System.out.println("Condition is true");
		else
			System.out.println("Condition is false");
		System.out.println("Statement following if-else");
		
		// The nested if statements read better and is better
		// understood using braces
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int min = 0;
		if(num1 < num2)
		{
			if(num1 < num3)
			{
				min = num1;
			}
			else
			{
				min = num3;
			}
		}
		else
		{
			if(num2 < num3)
			{
				min = num2;
			}
			else
			{
				min = num3;
			}
		}
		System.out.println("min: " + min);
	}
}
