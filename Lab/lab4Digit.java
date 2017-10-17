/*Design and implement an application that determines 
and prints the number of odd, even, and zero digits 
in an integer value read from the keyboard*/
package lab4Pack;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		System.out.print("Please enter an integer: ");
		Scanner scan = new Scanner(System.in);
		
		int odd = 0, even = 0, zero = 0;
		String number = scan.next();
		for (int i=0;i<number.length();i++)
		{
			String digit = number.substring(i,i+1);
			int idigit = Integer.parseInt(digit);
			if (idigit == 0)
				zero += 1;
			else
			{
				if (idigit % 2 != 0)
					odd += 1;
				else
					even += 1;
			}	
		}
		System.out.println("Zero digits: " + zero);
		System.out.println("Even digits: " + even);
		System.out.println("Odd digits: " + odd);
	}	
}
