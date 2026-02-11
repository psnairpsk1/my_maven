package EncapsulationSample;

public class EncapSample {
	
	private int salary;
	private String name;
	public void setter(String name,int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	public void getter()
	{
		System.out.println("The name of the employee is "+name);
		int incentive = 2000;
		salary = salary + 2000;
		System.out.println("The salary of employee is "+salary);
	}

}
