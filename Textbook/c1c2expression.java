//1.2 p60
package textbookc1;

public class Lincoln {

	public static void main(String[] args) {
		// print a quote
		System.out.println("A quote by Abraham Lincoln:");
		System.out.println("Whatever you are, be a good one.");

	}

}

//2.1 p85
package textbookc1;

public class Countdown {

	public static void main(String[] args) {
		// prints two lines of output
		System.out.print("Three...");
		System.out.print("Two...");
		System.out.print("One...");
		System.out.print("Zero...");
		System.out.println("Liftoff!");//appears on first output line
		System.out.println("Houston, we have a problem.");

	}

}

//2.2 p87
package textbookc1;

public class Facts {

	public static void main(String[] args) {
		// prints various facts
		System.out.println("We present the following facts for your "
				+ "extracurricular edification:");
		System.out.println();
		System.out.println("Letters in the Hawaiian alphabet: 12");
		System.out.println("Dialing code for Antarctica: " + 672);
		System.out.println("Year in which Leonardo da Vinci invented " 
				+ "the parachute: " + 1515);
		System.out.println("Speed of ketchup: " + 40 + " km per year");
	}

}

//2.3 p88
package textbookc1;

public class Addition {

	public static void main(String[] args) {
		// concatenates and adds two numbers and prints the results
		System.out.println("24 and 45 concatenated: " + 24 + 45);
		System.out.println("24 and 45 added: " + (24 + 45));

	}

}

//2.4 p90
package textbookc1;

public class Rose {

	public static void main(String[] args) {
		// demonstrate the use of escape sequences
		// prints a poem on multiple lines
		System.out.println("Roses are red, \n\tViolets are blue,\n" + 
		"Sugar is sweet,\n\tBut I have \"commitment issues\",\n\t" +
		"So I'd rather just be friends\n\tAt this point in our " +
		"relationship.");

	}

}

//2.5 p93
package textbookc1;

public class PianoKeys {

	public static void main(String[] args) {
		// integer variables
		int keys = 88;
		System.out.println("A piano has " + keys + " keys.");

	}

}

//2.6 p94
package textbookc1;

public class Geometry {

	public static void main(String[] args) {
		// assignment statement to change the value stored in a variable 
		int sides = 7;
		System.out.println("A heptagon has " + sides + " sides.");
		sides = 10;
		System.out.println("A decagon has " + sides + " sides.");
		sides = 12;
		System.out.println("A dedecagon has " + sides + " sides.");

	}

}

//2.7 p105
package textbookc2;

public class TempConverter {

	public static void main(String[] args) {
		// computes the Fahrenheit equivalent of a specific Celsius value
		final int BASE = 32;
		// final => constants, uppercase letters and can't be changed
		final double CONVERSION_FACTOR = 9.0 / 5.0;
		double fahrenheitTemp;
		int celsiusTemp = 24;
		
		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
		
		System.out.println("Celsius Temperature: " + celsiusTemp);
		System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);

	}

}

//2.8 p115
package textbookc2;

import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		// nextLine method of Scanner class 
		String message;
		// Scanner class is part of the java.util class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a line of text:");
		message = scan.nextLine();
		System.out.println("You entered: \"" + message + "\"");
	}

}

//2.9 p116
package textbookc2;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		// use of the Scanner class to read numeric data
		int miles;
		double gallons, mpg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of miles: ");
		miles = scan.nextInt();
		
		System.out.print("Enter the gallons of fuel used: ");
		gallons = scan.nextDouble();
		
		mpg = miles / gallons;
		
		System.out.println("Miles Per Gallon: " + mpg);
	}

}


