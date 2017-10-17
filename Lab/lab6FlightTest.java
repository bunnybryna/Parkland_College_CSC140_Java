package lab6Pack;

public class FlightTest {

	public static void main(String[] args) {
		Flight f1 = new Flight();
		System.out.println(f1);
		System.out.println();
		
		Flight f2 = new Flight();
		f2.setName("Bryna Airline");
		f2.setNumber(725);
		f2.setOrigin("Marketing Profession");
		f2.setDestination("Data Scientist");
		System.out.println(f2);
		System.out.println();
		
		Flight f3 = new Flight();
		f3 = f2;
		f3.setName("Dream Big");
		f3.setOrigin("the Earth");
		f3.setDestination("the Moon");
		System.out.println(f3+" and back!");
		
	}

}
