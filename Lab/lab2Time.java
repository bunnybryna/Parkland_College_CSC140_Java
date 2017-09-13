/*
  lab2:write an application that prompts for and reads an integer value in seconds 
  and then prints the equivalent amount of time as a combination of hours, minutes, and seconds
*/

package lab2Pack;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
	
	int inputSec, hr, min, sec;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter an integer please: ");
	inputSec = scan.nextInt();
	
	hr = inputSec / 3600;
	
	min = (inputSec % 3600) / 60;
	
	sec = (inputSec % 3600) % 60; 
	
	System.out.println(inputSec + " seconds equal to " + 
	hr + " hours " + min + " minutes and " + sec + " seconds.");
	}

}
