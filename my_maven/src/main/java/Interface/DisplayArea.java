package Interface;

public class DisplayArea implements InterfaceArea {

	public void draw()
	{
		System.out.println("Drawing the area of rectangle");
	}
	
	public void area()
	{
		System.out.println("The area of rectangle is " +(l *b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceArea ia = new DisplayArea();
		ia.draw();
		ia.area();
		System.out.println("The value of length is "+ia.l);
		System.out.println("The value of breadth is "+ia.b);
		
		System.out.println("Accessing through class object");
		DisplayArea da = new DisplayArea();
		System.out.println("The value of length is "+da.l);
		

	}

}
