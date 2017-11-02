package textbookc5;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		final int MINOR = 21;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		System.out.println("You entered: " + age);
		if (age < MINOR)
			System.out.println("Youth is a powerful thing. Enjoy.");
		System.out.println("Age is a state of mind.");

	}

}

package textbookc5;

import java.text.NumberFormat;
import java.util.Scanner;

public class Wages {

	public static void main(String[] args) {
		final double RATE = 8.25;
		final int STANDARD = 40;
		Scanner scan = new Scanner(System.in);
		double pay = 0.0;
		System.out.print("Enter the number of hours worked:");
		int hours = scan.nextInt();
		System.out.println();
		if(hours>STANDARD)
			pay = STANDARD * RATE + (hours-STANDARD) * (RATE * 1.5);
		else
			pay = hours * RATE;
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println("Gross earnings: " + fmt.format(pay));

	}

}

package textbookc5;

public class Coin {

	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	
	public Coin()
	{
		flip();
	}
	
	public void flip()
	{
		face = (int)(Math.random()*2);
	}
	public boolean isHeads()
	{
		return (face == HEADS);
	}
	public String toString()
	{
		String faceName;
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		return faceName;
	}
	
}


package textbookc5;

public class CoinFlip {

	public static void main(String[] args) {
		Coin myCoin = new Coin();
		myCoin.flip();
		System.out.println(myCoin);
		if(myCoin.isHeads())
			System.out.println("You win.");
		else
			System.out.println("Better luck next time.");

	}

}

package textbookc5;

import java.util.Scanner;

public class MinOfThree {

	public static void main(String[] args) {
		int num1, num2, num3, min = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three integers:");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if (num1 < num2)
			if (num1 < num3)
				min = num1;
            // else clause is always matched to the closest unmatched if
			else
				min = num3;

		else
			if(num2 < num3)
				min = num2;
			else
				min = num3;
				
		System.out.println("Minimum Value: " + min);
	}

}

package textbookc5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int sum = 0, value, count = 0;
		double average;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer(0 to quit):");
		value = scan.nextInt();
		while (value != 0)
		{
			count ++;
			sum += value;
			System.out.println("The sum so far is :" + sum );
			System.out.print("Enter an integer(0 to quit):");
			value = scan.nextInt();
		}
		System.out.println();
		if(count == 0)
			System.out.print("No values were entered.");
		else
		{
			average = (double)sum / count;
			DecimalFormat fmt = new DecimalFormat("0.###");
			System.out.print("The average is " + fmt.format(average));
			
		}

	}

}

package textbookc5;

import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {
		String str, another = "y";
		int left, right;
		
		Scanner scan = new Scanner(System.in);
		// don't use == to compare strings
		// use equals(return ture or false) or compareTo(return negative means <)
		while(another.equalsIgnoreCase("y"))
		{
			System.out.println("Enter a potential palindrome:");
			str = scan.nextLine();
			left = 0;
			right = str.length() - 1;
			while(str.charAt(left) == str.charAt(right) && left < right)
			{
				left++;
				right--;
			}
			System.out.println();
			if (left<right)
				System.out.println("That string is NOT a palindrome.");
			else
				System.out.println("That string is a palindrome.");				
			System.out.println();
			System.out.println("Test another (y/n)?");
			another = scan.nextLine();
		}

	}

}

package textbookc5;

import java.util.Scanner;
import java.io.*;

public class URLDissector {

	public static void main(String[] args) {
		String url;
		Scanner fileScan, urlScan;
		fileScan = new Scanner(new File("urls.inp"));
		while(fileScan.hasNext())
		{
			url = fileScan.nextLine();
			System.out.println("URL: " + url);
			urlScan = new Scanner(url);
			urlScan.useDelimiter("/");
			
			while(urlScan.hasNext())
			{
				System.out.println(" " + urlScan.next());
			}
			System.out.println();
		}

	}

}

package textbookc5;

import java.util.ArrayList;

public class Beatles {

	public static void main(String[] args) {
		ArrayList<String> band = new ArrayList<String>();
		band.add("Paul");
		band.add("Pete");
		band.add("John");
		band.add("George");
		
		System.out.println(band);
		int location = band.indexOf("Pete");
		band.remove(location);
		
		System.out.println(band);		
		System.out.println("At index 1: " + band.get(1));
		band.add(2, "Ringo");
		
		System.out.println("Size of the band: " + band.size());
		int index = 0;
		while(index < band.size())
		{
			System.out.println(band.get(index));
			index++;
		}

	}

}

