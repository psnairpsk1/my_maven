package Exceptions;

public class ArithException {
	public void display()
	{
		//Arithmetic exception
		int a = 10;
		try
		{
		int b = a/0;//exception code
		System.out.println(b);//exception code
		}
		
		catch(Exception e){
			System.out.println("Exception is handled");
			System.out.println(e);//this will give the error java.lang.ArithmeticException: / by zero
			
			
		}
		
		
		finally
		{
			System.out.println("Finally block is executed"); //finally block will execute even the catch method is not given
		}
		
		
		
	}
	
	public void print ()
	{
		System.out.println("I am here");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithException es = new ArithException();
		es.display();
		//es.print();
		//System.out.println("End of statement");//this statement will not print since after object creation it will call es.display and the below code will not work.

	}

}
