package accessmodifiers2;

import accessmodifiers.AccessSample1;

public class AccessSample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSample1 obj4 = new AccessSample1();
		System.out.println(obj4.a);
		//System.out.println(obj4.b);//private cannot be access
		//System.out.println(obj4.c);//protected cannot be access
		//System.out.println(obj4.d);//default cannot be access

	}

}
