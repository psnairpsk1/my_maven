package Exceptions;

public class SapleThrowException {
	

	public static void display(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("Not Eligible for license");
		}
		else
		{
			System.out.println("Eligible for taking licence");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SapleThrowException.display(10);
	/*OR*/	
	
	/*try
		{
		SapleThrowException.display(10);//change the parameter here then we will get the proper result if give below 18 you will get Arithmetic Exeption with our message.
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}*/
	}

}
