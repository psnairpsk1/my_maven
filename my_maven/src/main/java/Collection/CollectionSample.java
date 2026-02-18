package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=	new ArrayList();//non generic array list
		al.add("hello");
		al.add(1);
		al.add('c');
		al.add(34.67f);
		System.out.println(al);
		
		ArrayList<String> li =new ArrayList();//generic array list
		li.add("hello1");
		li.add("hello2");
		li.add("hello3");
		System.out.println(li);
		
		ArrayList<String> li2 =new ArrayList();//generic array list
		li2.add("red");
		li2.add("green");
		li2.add("blue");
		li2.add("yellow");
		
		System.out.println(li2);
		
		//remove
		
		li2.remove(1);
		System.out.println(li2);
		
		//add all to add al2 to li
		
		li.addAll(li2);
		System.out.println(li);
		
		//remove all
		
		li.removeAll(li);
		System.out.println(li);
		
		//get
		System.out.println(li2.get(2));
		
		//size
		System.out.println(li2.size());
		
		
		//contains--get true or false value
		boolean s = li2.contains("red");
		System.out.println(s);
		
		boolean s1 = li2.contains("redd");
		System.out.println(s1);
		
		Iterator it = li2.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());//line by line will be result
		}
		it.remove();
		System.out.println(li2);
	}
		

}
