package accessmodifiers;

public class AccessSample2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSample1 obj2 =new AccessSample1();
		System.out.println(obj2.a);
		//System.out.println(obj2.b);//we cannot call the private var in second class.With in the class only it have have access
		System.out.println(obj2.c);
		System.out.println(obj2.d);

	}

}
