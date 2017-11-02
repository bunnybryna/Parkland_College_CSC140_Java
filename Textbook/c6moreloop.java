package textbookc6;

import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		int grade, category;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a numberic grade (0 to 100): " );
		grade = scan.nextInt();
		category = grade / 10;
		System.out.print("That grade is ");
		
		switch(category)
		{
			case 10:
				System.out.println("a perfect score. Well done.");
				break;
			case 9:
				System.out.println("well above average. Excellent.");
				break;
			case 8:
				System.out.println("above average. Nice job.");
				break;
			case 7:
				System.out.println("average.");
				break;
			case 6:
				System.out.println("below average. You should see the instructor "
						+ "to clarify the material presented in class");
				break;
			default:
				System.out.println("not passing");				
		}
	}

}

package textbookc6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, lastDigit, reverse = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		number = scan.nextInt();
		
		do
		{
			lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number = number / 10;
		}
		while(number > 0);
			
		System.out.print("That number reversed is " + reverse);
		

	}

}

package textbookc6;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		final int PER_LINE = 5;
		int value, limit, mult, count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positve value: ");
		value = scan.nextInt();
		
		System.out.println("Enter an upper limit: ");
		limit = scan.nextInt();
		
		System.out.println();	
		System.out.println("The multiples of " + value + " between " 
				+ value + " and " + limit + "(inclusive) are:");
		for (mult = value; mult <= limit; mult += value)
		{
			System.out.print(mult + "\t");	
			count ++ ;
			// print a specific number of values per line
			if (count % PER_LINE == 0)
				System.out.println();	
		}

	}

}

package textbookc6;

public class Stars {

	public static void main(String[] args) {
		final int MAX_ROWS = 10;
		for (int row = 1; row <= MAX_ROWS; row++)
		{
			for (int star = 1; star <= row; star++)
				System.out.print("*");
			System.out.println();	
		}

	}

}


