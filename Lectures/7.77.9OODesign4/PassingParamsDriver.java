
public class PassingParamsDriver {

	public static void main(String[] args) {

		// Create new PassingParams object
		PassingParams pp = new PassingParams();
		
		// Test passing primitive variable as method parameter
		int ival = 10;
		System.out.println("ival before call to function: " + ival);
		pp.function(ival);
		System.out.println("ival after call to function: " + ival);
		
		// Testing passing object reference variable as method parameter
		Number n = new Number(10);
		System.out.println("n before call to function: " + n.val );
		pp.function(n);
		System.out.println("n after call to function: " + n.val );
	}

}
