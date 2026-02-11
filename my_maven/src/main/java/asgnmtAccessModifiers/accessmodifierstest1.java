package asgnmtAccessModifiers;

public class accessmodifierstest1 {
	private int a = 10;
	public float b= 45.56f;
	protected String s = "Hello";
	double d = 456.253d; 
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessmodifierstest1 ob = new accessmodifierstest1();
		ob.display();

	}

}
