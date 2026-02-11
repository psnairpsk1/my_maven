package Interface;

public class CalcSample implements InterfaceCalc {
	
	public void display()
	{
		System.out.println("This is the instance method from the class");
	}

	public void add()
	{
		System.out.println("The addition result is " +(a + b));
	}
	public void sub()
	{
		System.out.println("The subtraction result is " +(a - b));
	}
	public void mul()
	{
		System.out.println("The multiplication result is " +(a * b));
	}
	public void div()
	{
		System.out.println("The division result is " +(a / b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcSample cs = new CalcSample();
		System.out.println("The abstarct method access through class variables");
		cs.display();
		cs.add();
		cs.sub();
		cs.mul();
		cs.div();
		System.out.println(cs.a);
		System.out.println(cs.b);
		System.out.println("********************************************************");

		System.out.println("The abstaract method assess through interface object");
		InterfaceCalc ic = new CalcSample();
		ic.add();
		ic.sub();
		ic.mul();
		ic.div();
		System.out.println(ic.a);
		System.out.println(ic.b);

	}

}
