package Exceptions;

public class NullPointerExecptionAndTryCatch {
	
	public void display()
	{
		String s =null;
		try
		{
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerExecptionAndTryCatch nc = new NullPointerExecptionAndTryCatch();
		nc.display();

	}

}
