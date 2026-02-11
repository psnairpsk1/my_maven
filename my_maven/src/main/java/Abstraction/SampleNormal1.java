package Abstraction;

public class SampleNormal1 extends Shape{

	public void draw()
	{
		System.out.println("Draw Triangle");
	}
	public void display()
	{
		super.display();
		System.out.println("We are in SampleNormal1 class ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleNormal1 s= new SampleNormal1();
		s.draw();
		s.display();
		

	}

}
