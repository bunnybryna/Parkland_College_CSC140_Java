
public class Arrays1 {

	public static void main(String[] args) {

		// Arrays
		//
		// Arrays are a fundamental programming construct
		// we can use in Java to store a group of elements.
		// An array is NOT a class, but rather a construct
		// of the language. When we create an array, a fixed
		// area of memory is created to store the elements.
		// All the elements occupy a contiguous area of memory.
		// In other words, the elements are stored sequentially
		// in memory one after another in order. The array stores
		// a specific, fixed number of elements. The number of
		// elements stored is fixed and cannot be changed. All the 
		// elements in an array must be of the same data type. 
		// We can use arrays to store a group of built-in types. 
		// For example below we create an array to store a fixed
		// number (10) integer values.
		int[] iarray = new int[10];
		
		// We use an index from 0 to N-1 (where N represents
		// the number of elements) to set or get element values
		// Below we are setting the first and last elements
		iarray[0] = 45;
		iarray[9] = 2;
		
		// Below we are getting the first and last elements
		System.out.println(iarray[0] + ", " + iarray[9]);
		
		// We can use the elements as we would any other variable
		int ival = iarray[0] - 10;
		System.out.println("ival: " + ival);
		
		// We can use a for loop to get or set elements in an array
		// Below we set each element to a value computed using the 
		// loop counter. Note the array indices vary from 0 to 9.
		for(int i = 0; i < 10; ++i)
		{
			iarray[i] = i * 10;
		}
		
		// We can also use a for-each loop with an array
		// Below we get and print the elements using a for-each loop
		for( int i : iarray)
		{
			System.out.println(i);
		}
		
		// Each array has a constant we can access that stores
		// the length of the array. This is often used in the
		// condition of a for loop as shown.
		for(int i = 0; i < iarray.length; ++i)
			System.out.println("iarray[" + i + "]: " + iarray[i]);
		
		// If we know the values we'd like to assign to elements
		// when we create an array, we can use what is called an
		// "initializer list" to set each element value. Below
		// we create an array of characters and set each element
		// using an initializer list. Note that the "new" operator
		// nor the size required. Java will create an array 
		// using the new operator based on the number of elements
		// specified in the initializer list
		char[] letters = { 'c', 's', 'c', '-', 'j', 'a', 'v', 'a' };
		for(int i = 0; i < letters.length; ++i)
			System.out.println("letters[" + i + "]: " + letters[i]);
		
		
		// The array name actually stores an address in memory to
		// the first element in the array. Similar to object reference
		// variables, when we pass an array to a method, Java makes a 
		// copy of this address to use in the method. If the method 
		// changes any of the values in the array, it is changed in
		// the calling program. Below we pass our array to a method
		// that changes the array element values. Note the difference
		// before and after the call to this method. Note we've created
		// a static method that can be called using the name of this class
		System.out.println("iarray before method call");
		for(int i = 0; i < iarray.length; ++i)
			System.out.println("iarray[" + i + "]: " + iarray[i]);
		Arrays1.function(iarray);
		System.out.println("iarray after method call");
		for(int i = 0; i < iarray.length; ++i)
			System.out.println("iarray[" + i + "]: " + iarray[i]);
	}

	
	// Static method to change array element values
	public static void function(int[] a)
	{
		for(int i = 0; i < a.length; ++i)
			a[i] += 2;
	}
}
