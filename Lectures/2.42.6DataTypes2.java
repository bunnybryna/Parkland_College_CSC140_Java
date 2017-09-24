import java.util.Scanner;


public class DataTypes2 {

	public static void main(String[] args) {
		
		// Arithmetic Expressions
		
		// If either or both operands in an arithmetic expression
		// is a decimal value (floating-point), then the result
		// is also a floating-point value
		double x = 1.2;
		int y = 4;
		System.out.println("x + y: " + (x + y));
		
		// Note above we need parentheses to perform
		// the operation first, then add to the string
		// Note the difference below without them
		
		//''' Here prints 1.24 because of concatenation'''
		System.out.println("x + y: " + x + y );
		
		// Division using integers will truncate the
		// fractional part. Note this removes the fractional
		// part, it does NOT round the result
		int z = 11;
		System.out.println("z / y: " + (z / y));
		
		// Remainder operator, also called the modulus operator
		// returns remainder of dividing the first value by
		// the second value. Note this is NOT the fractional
		// part of a division, but rather how much is left
		// over after the first is divided by the second
		// Consider z % y or 11 % 4 with our variables above
		// 11 divided by 4 would be 2 to give us 8 with 3 left over
		// In other words, 4 can go into 11 2 times leaving a 
		// remainder of 3
		System.out.println("z % x: " + (z % y));
		
		// When storing the result of an expression, the expression
		// is solved first, then the result is assigned to the variable
		// Note since x is a floating-point value, the result of
		// x * y is also a floating-point value and since this 
		// intermediate result is a floating-point value adding
		// it to another integer, z, also results in a floating-point
		double result = x * y + z;
		System.out.println("x * y + z: " + result);
		
		// We can use a variable in an expression, then overwrite it
		result = result + 2;
		System.out.println("result: " + result);
		
		// Increment and decrement operators add and subtract 
		// by 1 and are typically used with integers as a way
		// of keeping count. We'll see later that these are 
		// very useful when repeating some operation a certain
		// number of times
		int count = 10;
		count++;
		count++;
		System.out.println("count: " + count);
		count--;
		count--;
		System.out.println("count: " + count);
		
		// We can also use them before or after the variable
		// Before the variable is called "prefix"
		// After the variable is called "postfix"
		
		// Postfix is applied after an expression
		int total;
		count = 15;
		total = count++;
		System.out.println("total, count: " + total + ", " + count);
		
		// Prefix is applied before an expression
		count = 15;
		total = ++count;
		System.out.println("total, count: " + total + ", " + count);
		
		
		// Data Conversion
		
		// One way data is converted between different primitive types
		// is when they are used in an expression and the compiler
		// converts them automatically. We call this technique "promotion".
		// We saw earlier that if one of the operands is a floating-point value (decimal) 
		// then the result is a floating-point value. In order to
		// compute the correct result, the compiler must convert
		// the other operand to a floating-point value if it is
		// not already. Since the variable x is a double, the
		// compiler converts the variable total to a floating-point
		// value to compute the result. Note however, that the original
		// integer variable, total, is not changed.
		result = x / total;
		System.out.println("total, x, result: " + total + ", " + x + ", " + result);
		
		// Another way to convert data between different primitive types
		// is by assigning one type to another. If assigned to a type
		// with more bits, we call it "widening" if assigned to a type
		// with less bits, we call it "narrowing". Such "narrowing"
		// assignments can lose information in the original type
		
		// '''In either case, the data in the original variable is not changed. '''
		
		// Note in our widening example below the  original variable is not changed
		int original = 10;
		double converted = original;
		System.out.println("original, converted: " + original + ", " + converted);
				
		// In our "narrowing" example, note how information is lost
		// Note also that when narrowing values, we must "cast" the
		// original to the new converted type. Below in order to convert
		// a double to a float, we "cast" it to be a float. In other
		// words, we tell the compiler to convert and potentially lose information
		double foriginal = 1234.567891234;
		float fconverted = (float)foriginal;
		System.out.println("foriginal, fconverted: " + foriginal + ", " + fconverted);
		
		// Another "narrowing" example with a cast from a float to an int type
		// Note how the fractional part in this case is truncated (removed, not rounded)
		int iconverted = (int)foriginal;
		System.out.println("foriginal, iconverted: " + foriginal + ", " + iconverted);
		
		
		// Reading multiple values
		
		// The Scanner class we saw earlier can be used to read
		// multiple values entered by the user in the Console window
		// When multiple values are entered we call each value a "token"
		// Tokens are typically separated by character(s) when entered
		// by the user. The typical separating character is a single
		// space, or what we call "whitespace". The Scanner class 
		// by default can accept multiple tokens separated by any number
		// of whitespaces. Try the example below. Note we use the print method 
		// instead of the println method to avoid printing a new-line after the prompt
		System.out.print("Enter two integers separated by a space: ");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		System.out.println("You typed: " + first + " and " + second);
	}
}
