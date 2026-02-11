package asgnmtAccessModifiers2;

import asgnmtAccessModifiers.accessmodifierstest1;
public class accessmodifierstest3 extends accessmodifierstest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Outside the package subclass only");
		accessmodifierstest3 obj3 = new accessmodifierstest3();
		//System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println(obj3.s);
		//System.out.println(obj3.d);
		

	}

}
