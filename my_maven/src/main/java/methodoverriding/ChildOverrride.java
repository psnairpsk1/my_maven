package methodoverriding;

public class ChildOverrride extends ParentOverride{

	@Override
	public void display()
	{
		//super.display(); if we want to call parent method we need to use super method 
		//or create a object of parent class in child main method and call using that object
		System.out.println("We are in ChildOverrride");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOverrride ob = new ChildOverrride();
		ob.display();
		//ParentOverride ob2 = new ParentOverride();
		//ob2.display();

	}

}
