import java.util.Random;


public class Arrays2 {

	public static void main(String[] args) {

		// Recall that arrays are used to store a group of elements. 
		// In our previous example, we demonstrated how to store
		// elements that were of the built-in, primtive data types. 
		// In addition to storing built-in types, we can also use
		// arrays to store object reference variable data types.
		// Below we create an array to store a fixed number (5) 
		// object reference variables of the Random class
		Random[] rarray = new Random[5];
		
		// Note that this statement above reserves memory
		// for 5 object reference variables each storing 
		// an address to an Random object created on the heap.
		// Note most importantly, however, that those objects
		// have NOT yet been created. In fact, if we print
		// out what is currently in the array note that the
		// output is "null". This "null" indicates that no
		// address is currently being stored. In other words
		// each array location is not pointing to anything.
		for(Random r : rarray)
			System.out.println(r);
		
		// Next, we actually create the objects and store the 
		// resulting address of each in object in each of
		// the array locations! We can actually use a for
		// loop for this purpose. Note that if we used
		// a for-each loop as above, it would NOT assign the 
		// addresses to each array location, but rather it would
		// assign it to the temporary variable "r" from the 
		// for-each loop above!
		for(int i = 0; i < rarray.length; ++i)
		{
			rarray[i] = new Random();
		}
		
		// If we print out each object reference variable now
		// we see a String representing each object. This is
		// actually the output from the default toString method.
		// This just lists the name of the class followed by
		// a unique identifier. 
		for(Random r : rarray)
			System.out.println(r);

		// We can now use any of the Random objects in the
		// array as we would a normal object reference variable
		int r0 = rarray[0].nextInt(10);
		System.out.println(r0);
		
		// Let's create another array storing object reference
		// variables of the String class, create and store the 
		// String objects in the array, and print them out. In
		// this example, we are creating and storing the addresses
		// manually instead of using a for loop
		String[] sarray = new String[5];
		sarray[0] = "CSC ";
		sarray[1] = "140 ";
		sarray[2] = "is a ";
		sarray[3] = "great ";
		sarray[4] = "class ";
		for(String s : sarray)
			System.out.print(s);
		
	}

}
