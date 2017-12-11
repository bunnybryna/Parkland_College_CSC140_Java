package textbookc9;

public class Book {

	protected int pages = 1500;
	public void setPages(int numPages)
	{
		pages = numPages;
	}
	public int getPages()
	{
		return pages;
	}
}

package textbookc9;

public class Words {

	public static void main(String[] args) {
		Dictionary webster = new Dictionary();
		System.out.println("Number of pages: " + webster.getPages());
		System.out.println("Number of definitions: " + webster.getDeifinitions());
		System.out.println("Definitions per page: " + webster.computeRation());

	}

}

package textbookc9;

public class Dictionary extends Book{
	private int definitions = 52500;
	public double computeRation()
	{
		return (double)definitions/pages;
	}
	public void setDefinitions(int numDefinitions)
	{
		definitions = numDefinitions;
	}
	public int getDeifinitions()
	{
		return definitions;
	}
	

}


package textbookc9;

public class Thought {

	public void message()
	{
		System.out.println("I feel like I'm diagonally parked in a " + "parallel universe.");
		System.out.println();
	}
}

package textbookc9;

public class Advice extends Thought{

	public void message()
	{
		System.out.println("Warning: Dates in calendar are closer "+"than they appear.");
		System.out.println();
		
		//explicitly invoke the parent's version
		super.message();
	}
}
package textbookc9;

public class Messages {

	public static void main(String[] args) {
		Thought parked = new Thought();
		Advice dates = new Advice();
		parked.message();
		dates.message();
	}

}

package textbookc9;

public class FoodItem {

	final private int CALORIES_PER_GRAM = 9;
	private int fatGrams;
	protected int servings;
	
	public FoodItem(int numFatGrams, int numServings)
	{
		fatGrams = numFatGrams;
		servings = numServings;
	}
	private int calories()
	{
		return fatGrams * CALORIES_PER_GRAM ;
	}
	
	public int caloriesPerServing()
	{
		return (calories()/servings);
	}
}

package textbookc9;

public class Pizza extends FoodItem {

	public Pizza (int fatGrams)
	{
		//FoodItem(int numFatGrams, int numServings)
		super(fatGrams, 8);
	}
}

package textbookc9;

public class FoodAnalyzer {

	public static void main(String[] args) {
		Pizza special = new Pizza(275);
		System.out.println("Caloires per serving: " + special.caloriesPerServing());
	}

}
