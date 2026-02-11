package EncapsulationSample;

public class SampleEnapResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapSample en = new EncapSample();/*why we used the EncapSample here menas thrgh the Aggregation property we can access the 
		encapsulated class menthods*/
		en.setter("Raju",300000);//for setting the values
		en.getter();//for getting the result
		System.out.println("Git Update");

	}

}

