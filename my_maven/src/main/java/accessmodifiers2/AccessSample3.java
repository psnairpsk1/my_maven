package accessmodifiers2;

import accessmodifiers.AccessSample1;

public class AccessSample3 extends AccessSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSample3 obj3 = new AccessSample3();
		System.out.println(obj3.a);
		//System.out.println(obj3.b);//private cannot be access
		System.out.println(obj3.c);
		//System.out.println(obj3.d);//default cannot be access
		

	}

}
