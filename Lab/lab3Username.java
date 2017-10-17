/*
Write an application that prompts for and reads the user’s first and last name (separately). Then print a string composed of the first letter of the user’s first name, followed by the first five characters of the user’s last name, followed by a random number in the range 10 to 99. Assume that the last name is at least five letters long.  
*/
package lab3Pack;

import java.util.Scanner;
import java.util.Random;

public class Username {

	public static void main(String[] args) {
		System.out.print("Please enter first and last name seperated by a space: ");
		Scanner scan = new Scanner(System.in);
		
		String first = scan.next();
		String last = scan.next();
		
		String name = first.charAt(0) + last.substring(0,5);
		
		//[10,99] <= [0,89]+10 <= [0,90)+10
		Random rand = new Random();
		int randint = rand.nextInt(90) + 10;
		// concatenation a string and an integer
		String username = name + randint;
		
		//System.out.println("Your random number is: " + randint);
		System.out.println("Your username is: " + username);

	}

}
