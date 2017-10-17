// Let's test our Adder class in another "driver" class
// that simply contains the main method to begin execution

public class AdderDriver {

	public static void main(String[] args) {
		
		// Let's create an object of our Adder class
		Adder a1 = new Adder();
		
		// Let's print out the state of this object.
		// Note that when the object name is used where
		// a String is expected as below, our "toString"
		// method in our Adder class is automatically called!
		System.out.println(a1);
		
		// Now, let's set the first and second numbers
		// in our Adder object, and print the new state
		a1.setFirst(2);
		a1.setSecond(3);
		System.out.println(a1);
		
		// We could also use our "get" methods to return
		// the values of our variables
		System.out.println("The first number is: " + a1.getFirst());
		System.out.println("The second number is: " + a1.getSecond());
		
		// Finally, let's execute the "add" method of 
		// our Adder class, and print the result
		int sum = a1.add();
		System.out.println("Result is: " + sum);
	}
}
