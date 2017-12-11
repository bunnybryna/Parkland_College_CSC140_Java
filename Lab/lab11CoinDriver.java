package lab11Pack;

public class CoinDriver {

	public static void main(String[] args) {

		// create objects called penny, nickel, dime
		MonetaryCoin penny = new MonetaryCoin(1);
		MonetaryCoin nickel = new MonetaryCoin(5);
		MonetaryCoin dime = new MonetaryCoin(10);
		
		// compute the total value
		int sum = penny.getValue() + nickel.getValue() + dime.getValue();
		System.out.println("Total value is " + sum + " cents");
		
		// inherit parent's ability to be flipped
		penny.flip();
		nickel.flip();
		dime.flip();
		System.out.println(penny);
		System.out.println(nickel);
		System.out.println(dime);

	}

}
