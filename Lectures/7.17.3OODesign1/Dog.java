// Dog class

// Enumerated variable type representing the dog breed 
// Note we declare this outside the class in order to make this
// available to other classes. The DogDriver class, for exampele,
// can use this enum when specifying the breed
enum Breed { none, hound, herding, sporting, toy, working };

public class Dog {

	// Fields - "what it knows"
	private String name;
	private double weight;
	private Breed breed;
	
	// publicly static variable storing number of dog objects
	public static int count = 0;
	
	// Methods - "what it does"
	//
	// Constructor(s)
	public Dog()
	{
		weight = 0.0;
		name = "None";
		breed = Breed.none;
		++count;
	}
	public Dog(String n, double w, Breed b)
	{
		name = n;
		weight = w;
		breed = b;
		++count;
	}
	
	// Speak (static method)
	public static String speak()
	{
		return "Ruff-ruff";
	}
	
	// Getters/setters
	public String getName()
	{
		return name;
	}
	public double getWeight()
	{
		return weight;
	}
	public Breed getBreed()
	{
		return breed;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setWeight(double w)
	{
		weight = w;
	}
	public void setBreed(Breed b)
	{
		breed = b;
	}
	
	// toString
	public String toString()
	{
		return name + " " + weight + " " + breed;
	}
}
