package Exceptions;

public class ExceptionSample {

	public void display()
	{
		//Arithmetic exception
		int a = 10;
		int b = a/0;//exception code
		System.out.println(b);//exception code
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSample es = new ExceptionSample();
		System.out.println("End of statement");
		es.display();
		System.out.println("End of statement");

	}

}
