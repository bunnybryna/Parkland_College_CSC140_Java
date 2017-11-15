// Simple class describing operations demonstrating changing method paramters
// Note this class only contains methods and these two methods are "overloaded"

public class PassingParams {
	
	// Methods
	//
	// Overloaded methods
	//
	// Note the two methods below have the exact same name
	// but differ in the the parameter types passed as input.
	// If two methods have the same name like this but differ
	// in their parameters, we say these methods are "overloaded".
	// This is useful when we want to use the same "message" or
	// "command" we speak as the interface for our object but
	// depending what we pass the method, the operation of the
	// command may be different.
	
	// Accepts a primitive integer variable as the method parameter
	// Note that the statement in the method works with a COPY
	// of the input parameter, so if it is changed, the value
	// passed to this method is not changed in the calling program
	public void function( int fval )
	{
		fval += 10;
	}
	
	// Accepts an object reference variable as the method parameter
	// Note that the statement in the method works with a COPY
	// of the input parameter. Since this is a copy of the address
	// of the object, the statements in the method are changing the 
	// instance data in the object passed to this method in 
	// the calling program. 
	public void function( Number fval )
	{
		fval.val += 10;
	}
}
