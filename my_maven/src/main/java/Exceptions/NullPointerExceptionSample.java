package Exceptions;


public class NullPointerExceptionSample {
	String s = null;
	public void display()
	{
		System.out.println(s.length());
	}
	public static void main(String args[])
	{
		NullPointerExceptionSample ne = new NullPointerExceptionSample();
		System.out.println("The program is regarding Null pointer exception");
		ne.display();
		System.out.println("Endo of the code");//end of the code will not print.bcz the error is found from 15th line itself and that never get execute the remaining code
	}

}
