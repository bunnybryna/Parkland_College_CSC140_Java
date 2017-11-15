import java.util.ArrayList;

// Kennel class
//
// Kennel "knows" about dogs
// Kennel "has a" dog - an "aggregation" class relationship
//
public class Kennel {

	// Fields
	private ArrayList<Dog> dogs;	// store dogs in an ArrayList
	
	// Methods
	//
	// Constructor
	public Kennel()
	{
		// Create the ArrayList of dogs
		dogs = new ArrayList<Dog>();
	}
	
	// Add a dog
	public void add(Dog d)
	{
		// Use the add method of the ArrayList
		dogs.add(d);
	}
	
	// Feed
	public void feed()
	{
		// For each dog in the list
		for(Dog d : dogs)
		{
			// Dog eats 1.5 pounds of food
			d.eat(1.5);
		}
	}
	
	// Getters/setters
	// generated automatically in Eclipse with:
	// Source->Generate Getters and Setters...
	// Note use of the "this" reference which
	// is an object reference variable that refers
	// to the object itself
	public ArrayList<Dog> getDogs() {
		return dogs;
	}

	public void setDogs(ArrayList<Dog> dogs) {
		this.dogs = dogs;
	}

	// toString method
	public String toString()
	{
		String result = "Dog list: " + "\n";
		
		// For each dog in the list
		for(Dog d : dogs)
		{
			// Add String representation of the dog
			result += "\t" + d + "\n";
		}
		
		// Return result
		return result;
	}
}
