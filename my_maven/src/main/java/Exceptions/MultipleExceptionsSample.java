package Exceptions;


public class MultipleExceptionsSample {

	public void display()
	{
		int a = 10;
		try
		{
		int b= a/0;
		System.out.println();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			int c = 500/0;
		}
		catch(Exception g)
		{
			System.out.println(g);
		}
		int i = -10;
		
			if(i>0)
			{
				System.out.println("it is a +ve number");
			}
			else
			{
				throw new IllegalArgumentException("The number passed is not a +ve number");
			}
		
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleExceptionsSample ms = new MultipleExceptionsSample();
		ms.display();

	}

}
