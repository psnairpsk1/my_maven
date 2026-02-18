package Interface;

public class MultipleChildClass implements InterParent1,InterParent2{

	public void show()
	{
		System.out.println("This is the method of child class");
	}
	public void display()//Creating the definition for display method from InterParent1
	{
		System.out.println("The sum of two number is " +(a+b));
	}
	public void print()//Creating the definition for print method from InterParent2
	{
		System.out.println("The method is from Interface InterParent2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChildClass mc = new MultipleChildClass();
		mc.show();
		mc.display();
		mc.print();

	}

}
