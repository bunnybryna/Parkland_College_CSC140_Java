package lab5Pack;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean done = false;
		while(!done)
		{
			System.out.println("Please enter an integer between 1 and 12 inclusive:");
			int value = scan.nextInt();
			if (value < 1 || value > 12)
			{
				System.out.println("Sorry, invalid input.");
			}
			else
			{
				for (int i = 1; i <= value; ++i) 
				{
					for (int j = 1; j <= value; ++j)
					{
						int result = i * j;
						// left-justifying within the specified width 						
						// another format: 000
						// System.out.print(" "+String.format("%03d", result));
						System.out.print(String.format("%-5d", result));	
					}
					System.out.println();
				}
				done = true;
			}
		}	

	}

}