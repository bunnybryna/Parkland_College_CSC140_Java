import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class UsingClasses2 {

	public static void main(String[] args) {

		// Random class
		//
		// To use the Random "class", we create a new "object"
		// using the following statement. As we did for Scanner
		// objects, we need to use the import statement to 
		// identify the Random class to the Java compiler
		// since it is not part of the default Java package.
		// Eclipse can include the import statement automatically
		// by typing Ctrl+Shift+o, which is a shortcut
		// for the menu item, Source->Organize Imports
		Random rand = new Random();
		
		// Look at the Random class documentation in
		// http://docs.oracle.com/javase/6/docs/api/
		// for a list and description of all the operations
		// (methods) a Random object can perform
		
		// One method can generate a random floating point value
		// between 0.0 and 1.0
		double d1 = rand.nextDouble();
		System.out.println("rand.nextDouble(): " + d1);
		
		// Oftentimes you can use multiply such random values
		// to "scale" the range of values. For example, if you
		// needed a decimal between 0.0 and 25.0, you could use:
		System.out.println("Decimal between 0.0 and 25.0: " + rand.nextDouble()*25.0);

		// One method can generate a random integer among all possible 
		// integers between -2,147,438,648 to 2,147,438,647 (p. 71 in text)
		int n1 = rand.nextInt();
		System.out.println("rand.nextInt(): " + n1);
		
		// One method can generate a random integer between
		// 0 and 1 less than a specfied integer sent to the method.
		// This example will create integers between 0 and 9
		int n2 = rand.nextInt(10);
		System.out.println("rand.nextInt(10): " + n2);

		// This method is often used to generate random
		// integers between some specified range.
		// For example, the following statement can be used
		// to generate integers between -6 and 17;
		// The random number will be between 0 and 23,
		// subtracting 6 will give the range -6 to 17
		int n3 = rand.nextInt(24) - 6;
		System.out.println("rand.nextInt(24) - 6: " + n3);
	
		// Math class
		//
		// Since the Math class is part of the default
		// Java package, we don't need to import it.
		// The Math class contains special types of 
		// methods that allow us to use them WITHOUT
		// requiring us to create an object from the class
		// as we've done with the previous classes we've
		// studied (e.g. Scanner, Random).
		// This special types of methods are called "static" methods
		// and instead of being called from an "object", 
		// they can be called using the name of the "class"
		// Notice in the documentation:
		// http://docs.oracle.com/javase/6/docs/api/
		// notice the keyword "static" specified in
		// the description of the various methods
		// 
		// For example, one static method computes and returns 
		// the absolute value of an integer
		int m1 = Math.abs(-5);
		System.out.println("Math.abs(-5): " + m1);
		
		// One static method computes the power of a first
		// number raised to the second number sent to the method
		double m2 = Math.pow(2.0,4.0);
		System.out.println("Math.abs(2.0,4.0): " + m2);
		
		// In addition to methods, the Math class also contains
		// static constants that we can use in our programs
		// One such common constant is the value of PI
		// Note how we specify a static constant also using 
		// the name of the class 
		System.out.println("Math.PI: " + Math.PI);
		
		// Let's use this static constant with another method
		// to return the value in degrees of PI/4
		double m3 = Math.PI/4.0;
		double m4 = Math.toDegrees(m3);
		System.out.println("PI/4.0 in radians, degrees: " + m3 + ", " + m4);
		
		// Another method can compute the cosine of a value
		// specified in radians
		double m5 = Math.cos(m3);
		System.out.println("Cosine of PI/4.0: " + m5);
		
		
		// NumberFormat class
		//
		// This class is used to format output in a specific manner
		// such as representing currency ($) or percentages (%).
		// We use it by first calling a static method that returns
		// an actual object we can use. For example, to create an
		// object to format values as percentages:
		NumberFormat fmt1 = NumberFormat.getPercentInstance();
		
		// We then use methods from the object to format values
		double d2 = 0.6;
		System.out.println("Value 0.6 as a percentage: " + fmt1.format(d2));
		
		NumberFormat fmt2 = NumberFormat.getCurrencyInstance();
		System.out.println("Value 0.6 as a currency: " + fmt2.format(d2));
		
		
		// DecimalFormat class
		//
		// This class is used to format decimal point values
		// in a variety of formats. We use this class in the 
		// typical way of creating objects with the "new" operator.
		// We use Strings to specify the pattern of the format
		DecimalFormat dfmt = new DecimalFormat();
		dfmt.applyPattern("0.##");
		System.out.println("PI to two digits: " + dfmt.format(Math.PI));
		
		// PrintStream class
		// 
		// Recall we have been using the following statement in our examples:
		// System.out.println
		// This statement is calls the method "println" of an object
		// named "out" that is contained in the System class.
		// This object is from a class type named "PrintStream"
		// Looking in the documentation for the "System" class:
		// http://docs.oracle.com/javase/6/docs/api/
		// Note the "out" object under "Field Summary" is a PrintStream 
		// class type. Looking under the "PrintStream" class shows
		// all the possible methods we can use (including println).
		// One such method, printf, simulates the "C" language style
		// of formatting output using special format specifies as shown below
		System.out.printf("PI to two digits: %.2f\n", Math.PI);
	}
}
