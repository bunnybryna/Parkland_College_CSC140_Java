package textbookc4;

public class Die {

	private final int MAX = 6;
	private int faceValue;
	
	public Die()
	{
		faceValue = 1;
	}
	public int roll()
	{
		// random=>[0,1), faceValue=>[1,6]
		faceValue = (int)(Math.random() * MAX) + 1;
		
		return faceValue;
	}
	
	public void setFaceValue(int value)
	{
		faceValue = value;
	}
	
	public int getFaceValue()
	{
		return faceValue;
	}
	
	public String toString()
	{
		String result = Integer.toString(faceValue);
		return result;
	}
}


package textbookc4;

public class RollingDice {

	public static void main(String[] args) {
		Die die1, die2;
		int sum;
		die1 = new Die();
		die2 = new Die();
		
		die1.roll();
		die2.roll();
		System.out.println("Die One:" + die1 + " Die Two: " + die2);
		
		die1.roll();
		die2.setFaceValue(4);
		System.out.println("Die One:" + die1 + " Die Two: " + die2);
		
		sum = die1.getFaceValue() + die2.getFaceValue();
		System.out.println("Sum: " + sum);
		
		sum = die1.roll() + die2.roll();
		System.out.println("Die One:" + die1 + "Die Two: " + die2);
		System.out.println("Sum: " + sum);		

	}

}

package textbookc4;

import java.text.NumberFormat;

public class Account {

	private final double RATE = 0.035;
	private long acctNumber;
	private double balance;
	private String name;
	
	public Account(String owner, long account, double initial)
	{
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	public double deposit(double amount)
	{
		balance = balance + amount;
		return balance;
	}
	
	public double withdraw(double amount, double fee)
	{
		balance = balance - amount - fee;
		return balance;
	}

	public double addInterest()
	{
		balance += balance * RATE;
		return balance;
	}

	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
}

package textbookc4;

public class Transactions {

	public static void main(String[] args) {
			Account acct1 = new Account("Ted Murphy", 72354, 102.56);
			Account acct2 = new Account("Jane Smith", 69713, 40.00);
			Account acct3 = new Account("Edward Demsey", 93757, 759.32);

			acct1.deposit(25.85);
			double smithBalance = acct2.deposit(500.00);
			System.out.println("Smith balance after deposit: " + smithBalance);
			System.out.println("Smith balance after withdrawal: " + acct2.withdraw(430.75,  1.50));
			
			acct1.addInterest();
			acct2.addInterest();
			acct3.addInterest();
			
			System.out.println();
			System.out.println(acct1);
			System.out.println(acct2);
			System.out.println(acct3);
			
	}

}

