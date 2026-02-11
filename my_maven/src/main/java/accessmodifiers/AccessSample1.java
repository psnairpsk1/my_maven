package accessmodifiers;

public class AccessSample1 {

	public int a= 10;
	private String b = "Hello";
	protected char c = 'C';
	float d = 45.46f;
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSample1 obj = new AccessSample1();
		obj.display();
		

	}

}
