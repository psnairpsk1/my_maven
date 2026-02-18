package Exceptions;

public class SampleUserException {

	public void test(int age) throws LicenseException
	{
		if (age <= 18)
		{
			throw new LicenseException("Not Eligible"); //LicenseException is a userdefined class it is like constructor
		}
		else
		{
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) throws LicenseException {
		// TODO Auto-generated method stub
		SampleUserException ob = new SampleUserException();
		ob.test(13);

	}

}
