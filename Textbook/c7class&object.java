package textbookc7;

public class Slogan {

	private String phrase;
	// static variable or class variable, shared among all instances of a class, only one copy
	private static int count = 0;
	
	public Slogan(String str)
	{
		phrase = str;
		count ++;
	}
	
	public String toString()
	{
		return phrase;
	}
	// static method can't reference instance variables, can reference static variables
	public static int getCount()
	{
		return count;
	}
	
}

package textbookc7;

public class SloganCounter {

	public static void main(String[] args) {
		Slogan obj;
		obj = new Slogan("Remember the alamo.");
		System.out.println(obj);

		obj = new Slogan("Don't worry. Be happy.");
		System.out.println(obj);

		obj = new Slogan("Live free or die.");
		System.out.println(obj);
		
		obj = new Slogan("Talk is cheap.");
		System.out.println(obj);
		
		obj = new Slogan("Write once, run anywhere.");
		System.out.println(obj);
		
		System.out.println();
		System.out.println("Slogan created: " + Slogan.getCount());
		
	}

}

package textbookc7;

public class RationalNumber {
	private int numerator, denominator;
	public RationalNumber(int numer, int denom)
	{
		if (denom == 0)
			denom = 1;
		if (denom < 0)
		{
			numer = numer * -1;
			denom = denom * -1;
		}
		numerator = numer;
		denominator = denom;
		
		reduce();
	}
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	public RationalNumber reciprocal()
	{
		return new RationalNumber(denominator, numerator);
	}
	public RationalNumber add(RationalNumber op2)
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;
		
		return new RationalNumber(sum, commonDenominator);
	}
	public RationalNumber subtract(RationalNumber op2)
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int difference = numerator1 - numerator2;
		
		return new RationalNumber(difference, commonDenominator);
	}
	public RationalNumber multiply(RationalNumber op2)
	{
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();
		
		return new RationalNumber(numer, denom);
	}
	public RationalNumber devide(RationalNumber op2)
	{
		return multiply(op2.reciprocal());
	}
	public boolean isLike(RationalNumber op2)
	{
		return (numerator == op2.getNumerator() && denominator == op2.getDenominator());
	}
	public String toString()
	{
		String result;
		if(numerator == 0)
			result = "0";
		else
			if (denominator == 1)
				result = numerator + "";
			else
				result = numerator + "/" + denominator;
		return result;
	}
	private void reduce()
	{
		if(numerator != 0)
		{
			int common = gcd(Math.abs(numerator),denominator);
			numerator = numerator / common;
			denominator = denominator / common;
		}
	}
	private int gcd(int num1, int num2)
	{
		while(num1 != num2)
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		return num1;
	}
	
	
}

package textbookc7;

public class RationalTester {

	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(6, 8);
		RationalNumber r2 = new RationalNumber(1, 3);
		RationalNumber r3, r4, r5, r6, r7;
		
		System.out.println("First rational number: " + r1);
		System.out.println("Second rational number: " + r2);
		
		if(r1.isLike(r2))
			System.out.println("r1 and r2 are equal.");

		else
			System.out.println("r1 and r2 are NOT equal.");
		r3 = r1.reciprocal();
		System.out.println("The reciprocal of r1 is: " + r3);
		r4 = r1.add(r2);
		r5 = r1.subtract(r2);
		r6 = r1.multiply(r2);
		r7 = r1.devide(r2);
		
		System.out.println("r1 + r2: " + r4);		
		System.out.println("r1 - r2: " + r5);	
		System.out.println("r1 * r2: " + r6);	
		System.out.println("r1 / r2: " + r7);	
	}

}

package textbookc7;

public class Address {
	private String streetAddress, city, state;
	private long zipCode;
	
	public Address(String street, String town, String st, long zip)
	{
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}
	
	public String toString()
	{
		String result;
		result = streetAddress + "\n";
		result += city + ", " + state + " " + zipCode;
		return result;
	}

}
package textbookc7;

public class Student {
	private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    
    public Student(String first, String last, Address home, Address school)
    {
    	firstName = first;
    	lastName = last;
    	homeAddress = home;
    	schoolAddress = school;
    }
    
    public String toString()
    {
    	String result;
    	result = firstName + " " + lastName + "\n";
    	result += "Home Address: \n" + homeAddress + "\n";
    	result += "School Address: \n" + schoolAddress;
    	
    	return result;
    }
}

package textbookc7;

public class StudentBody {

	public static void main(String[] args) {
		Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19805);
		Address jHome = new Address("21 Jump St.", "Blacksburg", "VA", 24551);
		Student john = new Student("John", "Smith", jHome, school);
		Address mHome = new Address("123 Main St.", "Euclid", "OH", 44132);
		Student marsha = new Student("Marsha", "Jones", mHome, school);
		
		System.out.println(john);
		System.out.println();
		System.out.println(marsha);

	}

}


