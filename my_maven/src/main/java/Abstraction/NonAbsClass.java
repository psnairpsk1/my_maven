package Abstraction;

public class NonAbsClass extends AbsClass{

	public void print()
	{
		System.out.println("The values or def are passed from child class to the abstract class method print");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonAbsClass na = new NonAbsClass();
		na.display();
		na.print();

	}

}
