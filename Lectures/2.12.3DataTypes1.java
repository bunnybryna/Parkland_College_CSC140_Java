import java.util.Scanner;


public class DataTypes1 {

	public static void main(String[] args) {
		
		// There are 2 categories of data types in Java
		// The first category is called "primitive", or "built-in", type
		// These data types store information only
		
		// Examples of primitive data type variable declarations
		byte b;				// byte, 8 bits
		short s;			// short integer, 16 bits
		int i;				// integer, 32 bits
		long l;				// long integer, 64 bits
		float f;			// float decimal, 32 bits
		double d;			// double decimal, 64 bits 
		char c;				// character, 16 bits
		boolean tf;			// boolean, two states only (true or false)
		
		// Examples of assigning variable values
		b = 2;
		s = 34;
		i = 10;
		l = 450;
		f = 32.45f;			// note use of 'f' to distinguish float from double
		d = 32.456789832;
		c = 's';
		tf = false;
		
		// We can also assign values in the declaration
		int i2 = 20;
		boolean b2 = true;
		
		// Printing the values to the Console window
		System.out.println("b: " + b);
		System.out.println("s: " + s);
		System.out.println("i: " + i);
		System.out.println("l: " + l);
		System.out.println("f: " + f);
		System.out.println("d: " + d);
		System.out.println("c: " + c);
		System.out.println("tf: " + tf);
		System.out.println("i2: " + i2);
		System.out.println("b2: " + b2);
		
		// We can change the values of variables anytime
		i = 33;
		System.out.println("New value of i: " + i);
		
		// A variable we do not want to change is called a constant
		// We can declare any variable to be a constant using the "final" modifier
		// Below we declare an integer constant
		// By convention, we use variable names with all uppercase for constants
		final int SIZE = 50;
		System.out.println("SIZE: " + SIZE);
		
		// Note the error if we tried to change this constant value
		//SIZE = 34;
		
		// The second category of data type is called a "class"
		// This data type can store information AND perform operations
		// The name we use for these operations are called "methods"
		// A wide variety of classes are included in Java for us to use
		// In addition, we'll see that we can create our own classes
		// We use a class when we can't describe our information using the primitive types
		// For example, consider storing information to describe a "dog"
		// We might have a color, an age, a height, a weight, and so on to describe the dog
		// Since we can't store all this information in a single primtive type,
		// to represent a "dog" in Java, we might create our own "class"
		// Before creating our own classes, we'll first learn to use existing classes
		// The first class we'll use is the "String" class
		// This is a Java class that describes a sequence of characters
		// It also has methods that can operate on this sequence of characters
		// We'll be looking at how to use these methods later
		// For now, let's look at how to declare a variable of this class type
		
		// The proper way to declare a variable of a class type is using the "new" operator
		// This tells Java to create a new "object" from the class "String"
		// Note the use of the word "object"
		// An "object" is created from a "class"
		// We then use this "object" by assigning it to a variable of the class type
		// Below we create an "object" of the "String" class type 
		// The variable we store it in is also called a "reference"
		// We'll be looking in detail at this later
		String str = new String();
		
		// We can assign it a value and print to the Console
		str = "Hello";
		System.out.println("Value of str: " + str);
		
		// We can change the value
		str = "CSC140";
		System.out.println("New value of str: " + str);
		
		// We can also assign the value when we create the object
		String str2 = new String("Hello");
		System.out.println("Value of str2: " + str2);
		
		// Among other things, we can concatenate a string
		str2 += " World";
		System.out.println("Concatenated str2: " + str2);
		
		// Since the String class is used so often in Java,
		// we don't need to specify the "new" operator upon creation
		// The following two lines are equivalent
		String str3a = new String("Example 3");
		String str3b = "Example 3";
		System.out.println("str3a: " + str3a);
		System.out.println("str3b: " + str3b);
		
		// Another Java class that we'll be using is the "Scanner" class
		// This class describes how information can be input, or "parsed"
		
		// We first create an object from this class type
		Scanner scan = new Scanner(System.in);
		// You might notice that you receive an error in Eclipse
		// This is because the program doesn't "know" about the Scanner class
		// We'll see later that classes are contained in "packages"
		// Some classes, such as String, are in packages included by default
		// The Scanner class, however, is in a package not included by default
		// An easy way to include this package select the Eclipse menu
		// Source->Organize Imports, or Ctrl+Shift+o
		// Note the package included at the top of our program
		
		// Let's prompt a user to input an integer
		System.out.print("Please input an integer: ");
		
		// We'll now use the Scanner object to read it in
		// Note how we use a method named "nextInt" from this object
		// This demonstrates how classes can perform operations
		// We'll be looking at this further as well
		int value = scan.nextInt();
		System.out.println("You entered: " + value);
		
	}

}
