package Final;

public class FinalParent {
	final int a= 10;
	public void display()
	{
		System.out.println("This is is normal methode from FinalParant");
		//a=30;//cannot assign value a as 30 bcz its a final in nature

	}
	public final void print()
	{
		System.out.println("This is a final method from FinalParant");
		//a=40;//cannot assign value a as 30 bcz its a final in nature
	}

}
