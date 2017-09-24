
public class UsingClasses1 {

	public static void main(String[] args) {
		
		// When we declare a variable, the Java
		// compiler reserves area in memory to
		// store information associated with that variable
		
		// Primitive data type variables:
		// The information stored in the memory area
		// from a primitive data type variable is 
		// the actual data of the primitive type.
		// For example, the actual value 12.3 is stored
		// in the memory area associated with the variable below
		// In this case, 8 bytes of memory are reserved 
		// to store this actual value
		double dval = 12.3;
		System.out.println("dval: " + dval);
		
		// Class object data type variables:
		// The information stored in the memory area
		// from a class object data type variable is
		// not the actual data in the class, but rather
		// a memory address to where the actual 
		// class object was created in memory.
		// The data associated with the object is then
		// stored in this memory location.
		// For example, the value stored in the
		// object variable (str) below is an address
		// to the area in memory where the object
		// is created and where the actual characters
		// from the String are stored. Because this variable 
		// stores an address, we say it "refers" to where
		// the object actually is in memory. For this
		// reason, we call class object variables "references"
		// or an object reference variable.
		String str = new String("Hello");
		
		// Recall above that we use the "new" operator
		// to create an "object" from the "class"
		// In this way, the compiler "creates" the object
		// from the class blueprint or "instantiates" an object
		// Notice also how the name of the class is used with parentheses:
		// String("Hello")
		// We call this a "constructor" which is 
		// actually a special type of operation (method).
		// It defines what happens after the object
		// is created in memory. Typically such operations
		// perform tasks such as initializing variables
		// stored in the class object
		
		// Once we have an object, we can ask it to "do"
		// things using the "dot" operator. The things it
		// "does" are referred to as "methods" 
		// For example, one method of the String class
		// can return the value of a character in the string
		// at the specified index (starting at zero)
		char c0 = str.charAt(0);
		char c1 = str.charAt(1);
		System.out.println("First two characters: " + c0 + ", " + c1);
		
		// Another method returns the number of characters
		System.out.println("Length of str: " + str.length());
		
		// Another method returns a sub-string
		String sub = str.substring(3);
		System.out.println("Sub-string starting at index 3: " + sub);
		
		// '''Note, however, that none of these methods allow
		// us to actually change the contents of the String characters.'''
		
		// This is because a String object is "immutable"
		
		// Reference assignment
		// Since object reference variables store addresses
		// we need to be careful assigning them to each other.
		// Below we overwrite the address in str1 with the
		// one stored in str2 and now both contain the 
		// address to the second string. By doing this,
		// we've "lost" the address to the first string
		String str1 = new String("String1");
		String str2 = new String("String2");
		str1 = str2;
		System.out.println("str1, str2: " + str1 + ", " + str2);	
	}
}
