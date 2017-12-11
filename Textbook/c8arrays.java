package textbookc8;

public class BasicArray {

	public static void main(String[] args) {
		final int LIMIT = 15, MULTIPLE = 10;
		int[] list = new int[LIMIT];
		for (int index=0;index<LIMIT;index++)
			list[index] = index * MULTIPLE;
		list[5] = 999;
		for (int value : list)
			System.out.print(value + " ");
	}

}
package textbookc8;
import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] numbers = new double[10];
		System.out.println("The size of the array: " + numbers.length);
		for (int index=0;index<numbers.length;index++)
		{
			System.out.print("Enter number " +(index+1) + " :");
			numbers[index] = scan.nextDouble();
			
		}
		System.out.println("The numbers in reverse order: ");
		for (int index=numbers.length-1;index>=0;index--)
			System.out.print(numbers[index]+ " ");

	}

}

package textbookc8;

import java.util.Scanner;

public class LetterCount {

	public static void main(String[] args) {
		final int NUMCHARS = 26;
		Scanner scan = new Scanner(System.in);
		int[] upper = new int[NUMCHARS];
		int[] lower = new int[NUMCHARS];
		char current;
		int other = 0;
		System.out.println("Enter a sentence :");
		String line = scan.nextLine();
		for (int ch=0;ch<line.length();ch++)
		{ 
			current = line.charAt(ch);
			if(current >= 'A' && current <= 'Z')
				upper[current-'A']++;
			else
				if (current >= 'a' && current <='z')
					lower[current-'a']++;
				else
					other++;
		}
		
		System.out.println();
		for (int letter=0;letter<upper.length;letter++)
		{
			// from A to Z
			System.out.print((char)(letter+ 'A'));
			System.out.print(": " + upper[letter]);
			// from a to z
			System.out.print("\t\t"+(char)(letter+ 'a'));
			System.out.println(": " + lower[letter]);			
		}
		System.out.println();
		System.out.println("Non-alphabetic characters: " + other);

	}

}

// array of objects
package textbookc8;

public class Grade {
	
	private String name;
	private int lowerBound;
	
	public Grade(String grade, int cutoff)
	{
		name = grade;
		lowerBound = cutoff;
	}
	public String toString()
	{
		return name + "\t" + lowerBound;
	}
	public void setName(String grade)
	{
		name = grade;
	}
	public void setLowerBound(int cutoff)
	{
		lowerBound = cutoff;
	}
	public String getName()
	{
		return name;
	}
	public int getLowerBound()

	{
		return lowerBound;
	}
}

package textbookc8;

public class GradeRange {

	public static void main(String[] args) {
		Grade[] grades = 
		{
			new Grade("A", 95), new Grade("A-", 90), new Grade("B+", 87), new Grade("B", 85),
			new Grade("B-", 80), new Grade("C+", 77), new Grade("C", 75), new Grade("C-", 70),
			new Grade("D+", 67), new Grade("D", 65), new Grade("D-", 60), new Grade("F", 0),
		};
		for (Grade letterGrade : grades)
		{
			System.out.println(letterGrade);
		}

	}

}

package textbookc8;

import java.text.NumberFormat;

public class DVD {

	private String title, director;
	private int year;
	private double cost;
	private boolean bluray;
	

	public DVD(String title, String director, int year, double cost, boolean bluray) {
		this.title = title;
		this.director = director;
		this.year = year;
		this.cost = cost;
		this.bluray = bluray;
	}
	
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String description;
		description = fmt.format(cost) + "\t" + year + "\t";
		description += title + "\t" + director;
		if (bluray)
			description += "\t" + "Blu-ray";
		
		return description;
	}
}

package textbookc8;

import java.text.NumberFormat;

public class DVDCollection {

	private DVD[] collection;
	private int count;
	private double totalCost;
	
	public DVDCollection()
	{
		collection = new DVD[100];
		count = 0;
		totalCost = 0.0;
	}
	
	public void addDVD(String title, String director, int year, double cost, boolean bluray)
	{
		if(count == collection.length)
			increaseSize();
		collection[count] = new DVD(title, director, year, cost, bluray);
		totalCost += cost;
		count ++;
	}
	
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String report = "~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "My DVD Collection\n\n";
		report += "Number of DVDs: "+ count + "\n";
		report += "Total cost: " + fmt.format(totalCost) + "\n";
		report += "Average cost: " + fmt.format(totalCost/count);
		
		report += "\n\nDVD List:\n\n";
		for (int dvd=0;dvd<count;dvd++)
		{
			report += collection[dvd].toString() +"\n";
		}
		return report;
	}
	
	public void increaseSize()
	{
		DVD[] temp = new DVD[collection.length * 2];
		for (int dvd=0;dvd<collection.length;dvd++)
		{
			temp[dvd] = collection[dvd];
		}
		collection = temp;
	}
}

package textbookc8;

public class Movies {

	public static void main(String[] args) {
		DVDCollection movies = new DVDCollection();
		movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);
		movies.addDVD("Iron Man", "Jon Favreau", 2008, 15.95, false);
		movies.addDVD("The matrix", "Andy & Lana Wachowski", 1999, 19.95, true);
		
		System.out.println(movies);

	}

}

// command-line arguments
// run => run configurations => choose class => argument tab
package textbookc8;

public class NameTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("           " + args[0]);
		System.out.println("My name is " + args[1]);
	}

}

package textbookc8;

public class Family {

	private String[] numbers;
	public Family(String ... names)
	{
		numbers = names;
	}
	public String toString()
	{
		String result = "";
		for (String name : numbers)
			result += name + "\n";
		return result;
	}
}

package textbookc8;

public class VariableParameters {

	public static void main(String[] args) {
		Family lewis = new Family("John", "Sharon", "Justin", "Kayla", "Nathan", "Samantha");
		Family camden = new Family("Stephen", "Annie", "Matt", "Mary", "Simon", "Lucy");
		
		System.out.println(lewis);
		System.out.println();
		System.out.println(camden);

	}

}

package textbookc8;

public class TwoArray {

	public static void main(String[] args) {
		int[] [] table = new int[5][10];
		for (int row=0;row<table.length;row++)
		{
			for(int col=0;col<table[row].length;col++)
			{
				table[row][col] = row * 10 + col;
			}
			
		}
		for (int row=0;row<table.length;row++)
		{
			for (int col=0;col<table[row].length;col++)
				System.out.print(table[row][col] + "\t");
			System.out.println();
				
		}

	}

}

package textbookc8;

import java.text.DecimalFormat;

public class SodaSurvey {

	public static void main(String[] args) {
		int[][] scores = {
				{3,4,5,2,1,4,3,2,4,4},
				{2,4,3,4,3,3,2,1,2,2},
				{3,5,4,5,5,3,2,5,5,5},
				{1,1,1,3,1,2,1,3,2,4}
		};
		final int SODAS = scores.length;
		final int PEOPLE = scores[0].length;
		
		int[] sodaSum = new int[SODAS];
		int[] personSum = new int[PEOPLE];
		
		for (int soda=0;soda<SODAS;soda++)
		{
			for(int person=0;person<PEOPLE;person++)
			{
				sodaSum[soda] += scores[soda][person];
				personSum[person] += scores[soda][person];
			}
		}
		DecimalFormat fmt = new DecimalFormat("0.#");
	    System.out.println("Averages:\n");
		for (int soda=0;soda<SODAS; soda++)
			System.out.println("Soda # "+ (soda+1) + ":" + fmt.format((float)sodaSum[soda]/PEOPLE));
		System.out.println();
		for (int person=0;person<PEOPLE; person++)
		{
			System.out.println("Person #" + (person+1) + ":" + fmt.format((float)personSum[person]/SODAS));
		}
	}

}
