
enum Suit { hearts, diamonds, spades, clubs }

public class UsingClasses3 {

	public static void main(String[] args) {

		// Enumerated types
		//
		// Oftentimes we would like a variable to only contain a 
		// certain number of specific values. Consider for example
		// the suits used in playing cards. We might want to use a variable that
		// only contains values representing hearts, diamonds, spades, clubs
		// Java provides a special data type, called an enumerated type,
		// that can be used to store only these values. Since we are 
		// defining a data type, we place the definition typically 
		// outside of a specific class method or even outside of the
		// class itself as we have done above, note the enumerated type
		// specified outside the class at the top of the file
		//
		// enum Suit { hearts, diamonds, spades, clubs }
		// Note also that we do not use an ending semi-colong
		//
		// We can now create and use variables of this type.
		// Note that we do not need to use the "new" operator
		Suit s1 = Suit.spades;
		
		// Since an enum is a special type of class, enum objects
		// can also perform operations by calling methods
		// One method returns the "ordinal" value which is an 
		// integer (starting at zero) represnting its index in
		// the sequence of possible values.
		System.out.println("Ordinal value of s1: " + s1.ordinal());
		
		// Another method can return a String representing the 
		// actual name of the value
		System.out.println("Name of s1 value: " + s1.name());
		
		
		// Wrapper classes
		//
		// Wrapper classes are class types that provide methods
		// to use for the all of the primitive data types. Think
		// of wrapper classes as containing a primitive variable
		// to store the actual value along with methods to operate
		// on the value. They are named the same name as the primitive 
		// types but with an uppercase first character. Wrapper classes
		// contain useful static methods to operate on input integer
		// values. A common one is used to convert integers specified
		// as strings to an actual integer value
		String str = "10";
		int istr = Integer.parseInt(str);
		System.out.println("str, istr: " + str + ", " + istr );
		
		// An automatic conversion process is used by Java called
		// "autoboxing" that converts a wrapper object to and from 
		// its primitive type
		Integer iw1 = new Integer(5);
		int ii1 = iw1;
		System.out.println("iw1, ii1: " + iw1 + ", " + ii1);
		int ii2 = 6;
		Integer iw2 = ii2;
		System.out.println("iw2, ii2: " + iw2 + ", " + ii2);
	}
}
