package methodOvrdPractise;

public class ChildMethodOverride extends ParentMethodOverride{

	public void display()
	{
		//super.display();
		System.out.println("we are in child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildMethodOverride ch =  new ChildMethodOverride();
		ch.display();
		//ParentMethodOverride po = new ParentMethodOverride();
		//po.display();

	}

}
