package Exceptions;

public class LicenseException extends Exception {
	//we are making a user defined exception.for that we are connecting it with Exception main class to gets it feature.In Short Exception is the main parent class here 
	public LicenseException(String s)
	{
	super(s);//its like LicenseException("Not Eligible")
	}
}
