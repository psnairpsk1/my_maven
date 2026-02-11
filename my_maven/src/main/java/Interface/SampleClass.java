package Interface;

public class SampleClass implements InterfaceSample {

	public void print()
	{
		System.out.println("Method of class");
	}
	public void add()
	{
		System.out.println(a + b);
	}
	public void display()
	{
		System.out.println("Method in interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SampleClass sc = new SampleClass();
		sc.print();
		sc.add();
		sc.display();
		System.out.println(sc.a);//the value is from interface*/
		InterfaceSample is = new SampleClass();
		//is.print();//cannot access through interface object.The method and object under interface is only accessable
		is.add();
		is.display();
		System.out.println(is.b);
		

	}

}
