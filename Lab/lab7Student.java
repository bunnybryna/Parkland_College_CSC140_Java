package lab7Pack;

public class Student {

	private String name;
	private int firstTest, secondTest, thirdTest;
	
	// default constructor
	public Student()
	{
		name = "Null";
		firstTest = 0;
		secondTest = 0;
		thirdTest = 0;
	}
	// overload constructor
	public Student(String theName, int test1, int test2, int test3)
	{
		name = theName;
		firstTest = test1;
		secondTest = test2;
		thirdTest = test3;		
	}
	
	// setters
	public void setTestScore(int testNum, int testScore)
	{
		switch (testNum)
		{
			case 1:
				firstTest = testScore;
				break;
			case 2:
				secondTest = testScore;
				break;
			case 3:
				thirdTest = testScore;
				break;				
			default:
				System.out.println("Invalid input!");
		}
	}
	public void setName(String theName)
	{
		name = theName;
	}
	
	// getters
	public int getTestScore(int testNum)
	{
		switch (testNum)
		{
			case 1:
				return firstTest;
				// no need to break, return ends the execution
			case 2:
				return secondTest;
			case 3:
				return thirdTest;				
			default:
				System.out.println("Invalid input!");
				return 0;
		}		
		
	}
	public String getName()
	{
		return name;
	}
	
	// make average() private, only accessible for members
	public double average()
	{
		return (firstTest + secondTest + thirdTest) / 3.0;
	}
	
	public String toString()
	{
		return ("student name: " + name + " \nfirst test: " + firstTest + "\nsecond test: " + 
				secondTest + "\nthird test: " + thirdTest + "\naverage score: " + average());
	}

}
