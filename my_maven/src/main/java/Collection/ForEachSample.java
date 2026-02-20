package Collection;

import java.util.ArrayList;

public class ForEachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li =new ArrayList();//generic array list
		li.add("hello1");
		li.add("hello2");
		li.add("hello3");
		for(String a :li)
		{
			System.out.println(a);
		}

	}

}
