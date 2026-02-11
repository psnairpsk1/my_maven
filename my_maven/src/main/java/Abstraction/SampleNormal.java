package Abstraction;

public class SampleNormal extends Shape {

	
	public void draw()
	{
		System.out.println("Draw traingle");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleNormal sn = new SampleNormal();
		sn.display();
		sn.draw();

	}

}
