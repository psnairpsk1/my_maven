package Exceptions;

public class BankAccount {

	public void paymet(int salary) throws PaymentException
	{
		if(salary < 20000)
		{
			//PaymentException is custom or user defined exception here
		throw new PaymentException("The payment is not done properly you earned less salary .This can be due to LOP");
		}
		else
		{
			System.out.println("Salary is properly credited");
		}
	}
	public static void main(String[] args) throws PaymentException {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		ba.paymet(2200);

	}

}
