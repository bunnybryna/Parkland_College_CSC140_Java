package textbookc3;

public class StringMutation {

	public static void main(String[] args) {
		// use of the String class and its methods
		String phrase = "Change is inevitable";
		String mutation1, mutation2, mutation3, mutation4;
		
		System.out.println("Original String: \"" + phrase + "\"");
		System.out.println("Length of string: " + phrase.length());
		
		mutation1 = phrase.concat(", except from vending machines.");
		mutation2 = mutation1.toUpperCase();
		mutation3 = mutation2.replace('E','X');
		mutation4 = mutation3.substring(3,30);
		
		System.out.println("Mutation #1: " + mutation1);
		System.out.println("Mutation #2: " + mutation2);
		System.out.println("Mutation #3: " + mutation3);
		System.out.println("Mutation #4: " + mutation4);
		
		System.out.println("Mutated length: " + mutation4.length());
	}

}


package textbookc3;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// create pseudo-random numbers using the Random class
		Random generator = new Random();
		int num1;
		float num2;
		
		num1 = generator.nextInt();
		System.out.println("A random integer: " + num1);
		
		num1 = generator.nextInt(10);
		System.out.println("From 0 to 9: " + num1);

		num1 = generator.nextInt(10)+1;
		System.out.println("From 1 to 10: " + num1);
		
		num1 = generator.nextInt(15) + 20;
		System.out.println("From 20 to 34: " + num1) ;
		
		num1 = generator.nextInt(20) - 10;
		System.out.println("From -10 to 9: "+ num1);
		
		num2 = generator.nextFloat();
		System.out.println("A random float (between 0 - 1): " + num2);
		
		num2 = generator.nextFloat() * 6;
		num1 = (int)num2 + 1;
		System.out.println("From 1 to 6: " + num1);

	}

}

package textbookc3;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// use Math class to perform a calculation based on user input
		int a, b, c;
		double discriminant, root1, root2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the coefficient of x squared: ");
		a = scan.nextInt();
		
		System.out.println("Enter the coefficient of x: ");
		b = scan.nextInt();
		
		System.out.println("Enter the constant: ");
		c = scan.nextInt();
		
		discriminant = Math.pow(b, 2)- (4 * a * c);
		root1 = ((-1 * b) + Math.sqrt(discriminant)) / ( 2 * a);
		root2 = ((-1 * b) - Math.sqrt(discriminant)) / ( 2 * a);		
		
		System.out.println("Root # 1: " + root1);
		System.out.println("Root # 2: " + root2);
	}

}

package textbookc3;

import java.util.Scanner;
import java.text.NumberFormat;

public class Purchase {

	public static void main(String[] args) {
		// use NumberFormat class to format output
		final double TAX_RATE = 0.06;
		
		int quantity;
		double subtotal, tax, totalCost, unitPrice;
		
		Scanner scan = new Scanner(System.in);
		
		NumberFormat fmt1= NumberFormat.getCurrencyInstance();
		NumberFormat fmt2 = NumberFormat.getPercentInstance();
		
		System.out.print("Enter the quantity: ");
		quantity = scan.nextInt();
		
		System.out.print("Enter the unit price: ");
		unitPrice = scan.nextDouble();
		
		subtotal = quantity * unitPrice;
		tax = subtotal * TAX_RATE;
		totalCost = subtotal + tax;
		
		System.out.println("Subtotal: " + fmt1.format(subtotal));
		System.out.println("Tax: " + fmt1.format(tax) + " at " + fmt2.format(TAX_RATE));
		System.out.println("Total: " + fmt1.format(totalCost));	

	}

}

package textbookc3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleStats {

	public static void main(String[] args) {
		// use formatting of decimal values using DecimalFormat class
		int radius;
		double area, circumference;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the circle's radius: ");
		radius = scan.nextInt();
		
		area = Math.PI * Math.pow(radius, 2);
		circumference = 2 * Math.PI * radius;
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("The circle's area: " + fmt.format(area));
		System.out.println("The circle's circumference: " + fmt.format(circumference));

	}

}

package textbookc3;

public class IceCream {
	// define enum outsie a specific class method or even outside the class itself
	// do not use an ending semi-colon!
	enum Flavor {vanilla, chocolate, strawberry, fudgeRipple, coffee, rockyRoad, mintChocolateChip, cookieDough}	

	public static void main(String[] args) {
		// use enumerated types
		Flavor cone1, cone2, cone3;
		
		cone1 = Flavor.rockyRoad;
		cone2 = Flavor.chocolate;
		
		System.out.println("cone1 value: " + cone1);
		System.out.println("cone1 ordinal: " + cone1.ordinal());
		System.out.println("cone1 name: " + cone1.name());
		

		System.out.println("cone2 value: " + cone2);
		System.out.println("cone2 ordinal: " + cone2.ordinal());
		System.out.println("cone2 name: " + cone2.name());


		cone3 = cone1;
		
		System.out.println("cone3 value: " + cone3);
		System.out.println("cone3 ordinal: " + cone3.ordinal());
		System.out.println("cone3 name: " + cone3.name());
		
		

	}

}
