
public class DogDriver {

	public static void main(String[] args) {
		
		// Create a dog
		Dog d1 = new Dog();
		d1.setName("Lassie");
		d1.setWeight(50);
		d1.setBreed(Breed.herding);
		System.out.println(d1);
		
		// Create another dog
		Dog d2 = new Dog("Spitz", 60.5, Breed.working);
		System.out.println(d2);
		
		// Use of a static method in Dog class
		// Note how we use the name of the class to invoke the method
		System.out.println("Dogs typically say: " + Dog.speak());

		// Use of a public static variable in Dog class
		// Note how we use the name of the class to access the variable
		System.out.println("Number of dog objects: " + Dog.count);
	}

}
