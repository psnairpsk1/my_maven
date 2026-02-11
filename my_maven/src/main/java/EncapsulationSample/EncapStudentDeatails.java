package EncapsulationSample;

public class EncapStudentDeatails {
	private String name ;
	private int rollno;
	private int mark;
	public void setter(String name,int rollno,int mark)
	{
		this.name = name;
		this.rollno = rollno;
		this.mark = mark;
	}
	
	public void getter()
	{
		System.out.println("The Student name is "+name);
		System.out.println("The roll no is " +rollno);
		if (mark > 65)
		{
			mark = mark + 100;
			System.out.println("The mark with bonus mark is "+mark);
			
		}
		
		else {
			System.out.println("The mark withourt bonus mark is "+mark);
		}
	}

}
