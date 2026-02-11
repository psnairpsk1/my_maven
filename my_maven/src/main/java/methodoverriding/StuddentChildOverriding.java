package methodoverriding;

public class StuddentChildOverriding extends StuddentParentOverriding {

	@Override
	public void studentDetails(String name)
	{
		//to call parent method we can use super keyword here
		System.out.println("The student name in StuddentChildOverriding class is "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StuddentChildOverriding ob = new StuddentChildOverriding();
		ob.studentDetails("Prasanth");
		
		//to call parent method we can use parent class object
		

	}

}
