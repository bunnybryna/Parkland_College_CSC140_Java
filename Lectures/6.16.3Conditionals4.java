import java.util.Scanner;

public class Conditionals4 {

	public static void main(String[] args) {
		
		// switch statement
		//
		// "switch" statements are most often used to select among multiple
		// options upon the match of a condition. Each "case" represents
		// one of many different options that might match the condition in the switch
		// statement. Once a match is found, flow of control continues immediately
		// after the "case" statement. For example, we might want to execute statements 
		// based on an input value from a user.
		System.out.print("Enter the integer 1, 2, or 3: ");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		
		System.out.println("First switch statement example");
		switch(value)
		{
		case 1:
			System.out.println("\tcase 1 matched condition in switch statement");
			break;
		case 2:
			System.out.println("\tcase 2 matched condition in switch statement");
			break;
		case 3:
			System.out.println("\tcase 3 matched condition in switch statement");
			break;
		}
		
		// If we want to execute a statement(s) if none of our specified cases 
		// match, we can use an optional "default" case
		System.out.println("Second switch statement example");
		switch(value)
		{
		case 1:
			System.out.println("\tcase 1 matched condition in switch statement");
			break;
		case 2:
			System.out.println("\tcase 2 matched condition in switch statement");
			break;
		case 3:
			System.out.println("\tcase 3 matched condition in switch statement");
			break;
		default:
			System.out.println("\tno matched condition in switch statement");
		}

		// Note how we use "break" statements above to break control of flow out
		// of the switch statement and continue after the closing switch statement
		// curly brace. If we didn't include a "break" after each case, flow of control
		// continues into the next case whether it matches the condition or NOT!
		// The majority of the time, this is NOT what we intend to accomplish
		// with a switch statement
		System.out.println("Third switch statement example");
		switch(value)
		{
		case 1:
			System.out.println("\tcase 1 matched condition in switch statement");
		case 2:
			System.out.println("\tcase 2 matched condition in switch statement");
		case 3:
			System.out.println("\tcase 3 matched condition in switch statement");
		default:
			System.out.println("\tno matched condition in switch statement");
		}

		// conditional operator
		//
		// The conditional operator is a "short-cut" for a simple "if-else" statement that
		// results in a variable assignment. Consider the following if-else statement:
		int min;
		int value2 = 0;
		int value3 = 2;
		if(value2 < value3)
			min = value2;
		else
			min = value3;
		System.out.println("value2, value3, min: " + value2 + ", " + value3 + ", " + min);
		
		// We can replace this if-else with a conditional operator as follows.
		// Our "if" condition is tested below, if it is "true", the expression following
		// the "?" is executed. If it is "false", the expression following the the ":"
		// is executed.
		min = (value2 < value3) ? value2 : value3;
		System.out.println("value2, value3, min: " + value2 + ", " + value3 + ", " + min);

		
		// do statement
		//
		// the "do" statement, also called the "do-while" statement is typically used
		// when you need to execute the statement(s) in a while loop once at the beginning 
		// before you begin testing the condition in the "while" loop. Upon a true condition
		// in the while loop, these same statements will then continue. Consider the following
		// example. NOTE that unlike the single "while" statement we looked at previously,
		// the while statement has an ending semi-colon!
		int test = -1;
		do
		{
			System.out.println("In do statement, test is: " + test);
			++test;
		}
		while(test >= 0 && test < 3);
		System.out.println("test: " + test);		
	}

}
