package Final;

public class FinalChild extends FinalParent{

	@Override
	public void display()
	{
		System.out.println("The method is accessd from it's child class");
	}
	
	/*public void print()
	{
		System.out.println("This is a final method from FinalChild"); //The methode cannot change bcz the final keyword already been used in parent class for the same method name
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalChild fc = new FinalChild();
		fc.display();

	}

}
