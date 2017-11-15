// Suppose we have the following program description:
//
// Write a program to maintain a kennel of dogs 
// and feed each dog in the kennel
//
// We identify "kennel" and "dog" as good candidate
// for classes and implement the program below
// using objects of these classes
//
public class KennelDriver {

	public static void main(String[] args) {

		// Create a kennel
		Kennel kennel = new Kennel();
		
		// Add some dogs
		// Note that since the add method of the Kennel class
		// accepts a dog object as its parameter, we can
		// create and send the resulting dog object in
		// a single line as shown below
		kennel.add( new Dog("Lassie",55.25,Breed.herding) );
		kennel.add( new Dog("Spitz",61.7,Breed.working) );
		kennel.add( new Dog("Rover",32.3,Breed.hound) );
		
		// Print the state of the kennel
		System.out.println("Kennel before feeding:");
		System.out.println(kennel);
		
		// Feed the dogs
		kennel.feed();
		
		// Print the state of the kennel
		System.out.println("Kennel after feeding:");
		System.out.println(kennel);
	}
}
