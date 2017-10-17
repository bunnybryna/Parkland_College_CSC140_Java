package lab6Pack;

public class Flight {
	private String name;
	private int number;
	private String origin;
	private String destination;
	
	// constructor
	public Flight()
	{
		name = "nameNull";
		number = 0;
		origin = "originNull";
		destination = "destinationNull";
	}
	// setters
	public void setName(String flightName)
	{
		name = flightName;
	}
	public void setNumber(int flightNumber)
	{
		number = flightNumber;
	}
	public void setOrigin(String flightOrigin)
	{
		origin = flightOrigin;
	}
	public void setDestination(String flightDestination)
	{
		destination = flightDestination;
	}
	
	// getters
	public String getName()
	{
		return name;
	}
	public int getNumber()
	{
		return number;
	}
	public String getOrigin()
	{
		return origin;
	}
	public String getDestination()
	{
		return destination;
	}
	
	
	// for printing
	public String toString()
	{
		return ("name: " + name + " number: " + number + " from " + origin + " to " + destination); 
	}
	

}
