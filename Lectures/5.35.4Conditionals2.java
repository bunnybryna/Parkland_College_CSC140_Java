import java.util.Scanner;


public class Conditionals2 {

	public static void main(String[] args) {

		// Comparing decimal values
		//
		// Care must be taken when comparing decimal values
		// since computations can create very small differences 
		// in the resultant values and their binary representation
		// For example, results of calculations in your code could
		// result in two numbers that appear to be the same but
		// are slightly different as shown below.
		// Note the slight differences in decimal value between the numbers
		float f1 = 1.0f/3.0f;
		System.out.println("f1: " + f1);
		float f2 = 1.0f/2.999999f;
		System.out.println("f2: " + f2);
				
		// We can use static wrapper class methods to examine
		// their binary representation as shown below.
		// Note the slight differences in binary form between the numbers
		int b1 = Float.floatToIntBits(f1);
		System.out.println("f1 in binary: " + Integer.toBinaryString(b1));
		int b2 = Float.floatToIntBits(f2);
		System.out.println("f2 in binary: " + Integer.toBinaryString(b2));

		// If we printed these out using less significant digits, 
		// it would appear they are equal to each other
		System.out.printf("f1: %.4f, f2: %.4f\n", f1, f2);
		
		// We might assume they are equal but yet find that the
		// equality operator indicates otherwise
		System.out.println("Comparison using equality operator");
		if( f1 == f2 )
		{
			System.out.println("  f1 and f2 are equal");
		}
		else
		{
			System.out.println("  f1 and f2 are NOT equal");
		}

		// For these slight differences, we typically compare decimal
		// values by taking their absolute difference and then comparing 
		// this difference to some very small value, or tolerance as shown below
		System.out.println("Comparison using absolute difference");
		final float TOLERANCE = 1.0e-6f;
		if( Math.abs(f1-f2) < TOLERANCE )
		{
			System.out.println("  f1 and f2 are equal");
		}
		else
		{
			System.out.println("  f1 and f2 are NOT equal");
		}
		
		
		// Comparing characters
		//
		// Note that characters have a corresponding numeric value
		// as specified in the Unicode representation (Appendix C)
		// We can use casting to examine these numeric values
		// Note that even non-printable characters (e.g. tab) have values
		char a = 'a';
		char b = 'b';
		char tab = '\t';
		System.out.println("a character value: " + (int)a);
		System.out.println("b character value: " + (int)b);
		System.out.println("tab character value: " + (int)tab);
		
		// These values are used when comparing characters
		System.out.println("Comparing characters");
		if( a == b )
		{
			System.out.println("  a and be are equal");
		}
		else
		{
			System.out.println("  a and be are NOT equal");
		}
		
		// We can use numeric values to compare characters as well
		System.out.println("Comparing characters by cast");
		if( (int)a == (int)b )
		{
			System.out.println("  a and be are equal");
		}
		else
		{
			System.out.println("  a and be are NOT equal");
		}
		
		// Comparing objects
		// 
		// Since object variables store the address where the
		// actual object lives in memory, comparing object variables
		// only compares their addresses, NOT the contents in the objects
		// Consider two String objects below with the same values
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		// These two objects are created in memory at different 
		// address locations that are stored in s1 and s2.
		// If we "compare" their values with the equality operator
		// it will result in a false result since we are comparing
		// NOT the actual characters, but rather their addresses
		System.out.println("s1, s2: " + s1 + ", " + s2);
		System.out.println("Comparing s1 and s2 with equality operator");
		if( s1 == s2 )
		{
			System.out.println("  s1 and s2 are equal");
		}
		else
		{
			System.out.println("  s1 and s2 are NOT equal");
		}
		
		// If we want to compare the actual contents stored in the
		// object, we instead use a method named "equals" that is defined
		// in each class that we use and write. The developer of the
		// class decides how to compare the contents. For the String class
		// this method compares both sequences of characters
		System.out.println("Comparing s1 and s2 using the equals method");
		if( s1.equals(s2) )
		{
			System.out.println("  s1 and s2 are equal");
		}
		else
		{
			System.out.println("  s1 and s2 are NOT equal");
		}

		// Another method in the String class allows us to compare
		// String objects by their lexicographic ordering (the actual
		// numeric values in the Unicode table).
		String s3 = new String("aa");
		String s4 = new String("ab");
		System.out.println("s3, s4: " + s3 + ", " + s4);
		System.out.println("Comparing s3 and s4 with the compareTo method");
		int result = s3.compareTo(s4);
		System.out.println("  return value of compareTo method: " + result);
		
		
		// while loop
		//
		// One example of using a while loop is for gathering user commands.
		// Consider a menu prompting a user to choose from various tasks until
		// they select the task to indicate they are done.
		Scanner scan = new Scanner(System.in);
		boolean done = false;
		while( !done )
		{
			System.out.println("===========");
			System.out.println("1) Continue");
			System.out.println("2) Quit");
			System.out.println("===========");
			System.out.print("Enter your selection: ");
			int value = scan.nextInt();
			if(value == 1)
			{
				System.out.println("you want to continue");
			}
			else
			{
				System.out.println("you want to quit");
				done = true;
			}
		}
		
		// infinite loops
		//
		// Care should be taken when using loops to avoid the case
		// where we never end the looping statement such as the example
		// in the slide. If this occurs in Eclipse, we can select the red
		// square button in the Console to end the program
/*		
  		int count = 1;
		while( count <= 25 )
		{
			System.out.println("count: " + count);
			count = count - 1;
		}
*/		

		// Quick Check from slide
		int count1 = 1;
		int printVal = 0;
		while(count1 <= 10)
		{
			int count2 = 1;
			while(count2 < 20)
			{
				++printVal;
				System.out.println("Here printed " + printVal + " times");
				count2++;
			}
			count1++;
		}
	}

}
