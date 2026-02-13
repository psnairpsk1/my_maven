package Exceptions;

public class NumberOrNotUsingThrow {

	public void display(int a)
	{
		if (a < 0)
		{
			throw new ArithmeticException("The given value is a valid number");
		}
		else
		{
			System.out.println("The given number is not valid");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOrNotUsingThrow nt =new NumberOrNotUsingThrow();
		nt.display(-25);

	}

}
