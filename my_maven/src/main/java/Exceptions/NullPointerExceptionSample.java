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
	}

}
