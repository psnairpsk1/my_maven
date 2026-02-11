package EncapsulationSample;

public class EncapPrintStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapStudentDeatails ed = new EncapStudentDeatails();//using aggregate methode we rae calling encapsulated class
		ed.setter("Manu", 11, 65);
		ed.getter();

	}

}
