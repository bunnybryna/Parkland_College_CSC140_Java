import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Conditionals3 {

	public static void main(String[] args) throws FileNotFoundException {

		// else-if
		//
		// We can use another conditional along with if and else
		// known as the else-if statement. Instead of a simple else
		// statement following an if conditional, we can use the else-if
		// to proceed if another conditional is met. In this way, this
		// allows us to test for multiple conditions. The else-if follows
		// an "if" or another "else-if". Suppose we would like to perform
		// a certain statement if an integer is greater than 10 and another statement
		// if the integer is less than 10. The if and else-if can be used as 
		// follows. Think of the "else-if" as an else with a condition.
		// Note we can optionally add another "else" to the end if 
		// none of the conditions are true.
		int x = 10;
		System.out.println("x before conditionals: " + x);
		if(x > 10)
		{
			x += 5;
		}
		else if( x < 10 )
		{
			x -= 5;
		}
		else
		{
			x += 10;
		}
		System.out.println("x after conditionals: " + x);
		
		
		// Iterators
		//
		// The Scanner class implements iteration
		// methods that allow us to process multiple
		// items in some type of "collection". For example, we
		// can process a sentence entered by a user which can be 
		// viewed as a "collection" of strings separated by spaces.
		//
		// In the example below we use a scanner first to get
		// the entire line of the sentence
		System.out.print("Enter a sentence: ");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		// Next, we'll create a second scanner to process
		// the sentence by sending the string to the Scanner
		// constructor. Note that this uses a different constructor
		// to process strings separated by spaces.
		Scanner scanSentence = new Scanner(sentence);
		
		// Now we can use a loop to check if there is a 
		// word ready to be processed and terminate when
		// there are no more words in the sentence.
		while(scanSentence.hasNext())
		{
			String word = scanSentence.next();
			System.out.println(word);
		}
		
		// We could do the same thing if our sentence was
		// stored in an ASCII text file as shown below.
		// We are also keeping a running count on the 
		// number of words processed in the sentence.
		// Note also the use of a new class, "File" that
		// requires the addition of a "throws" statement
		// on the first line of our main method above.
		// We'll be studying such statements in depth
		// in CSC 256. Note this "sentence.txt" text file is 
		// placed under the Eclipse project folder 
		// (not the src or package folder) in the Package Explorer
		int count = 0;
		System.out.println("Reading the file sentence.txt");
		Scanner scanFile = new Scanner(new File("sentence.txt"));
		while(scanFile.hasNext())
		{
			String word = scanFile.next();
			System.out.println("Word " + count + ": " + word);
			++count;
		}
		System.out.println("The sentence contains " + count + " words");

		
		// The ArrayList class
		//
		// Suppose we'd like to use the words of the sentence
		// in this file later for further processing. The ArrayList
		// class is ideal for storing multiple items of the same
		// type for such a reason. Let's read the file again, but
		// this time store each word in an ArrayList object
		//
		// We first instantiate a new ArrayList object to store
		// a collection of String objects
		ArrayList<String> words = new ArrayList<String>();
		
		// Next we'll read the file in a similar manner
		System.out.println("Reading the file sentence.txt and storing the words");
		Scanner scanFile2 = new Scanner(new File("sentence.txt"));
		while(scanFile2.hasNext())
		{
			String word = scanFile2.next();
			
			// After reading the word, we "add" it to the collection
			words.add(word);
		}
		
		// Now that we can process our stored words
		System.out.println("Word 3: " + words.get(3));
		
		// We can use methods of the ArrayList class
		// to get the number of elements (size()) and 
		// another method to get a specific element
		int index = 0;
		while(index < words.size())
		{
			System.out.println("Word " + index + ": " + words.get(index));
			++index;
		}
	}

}
