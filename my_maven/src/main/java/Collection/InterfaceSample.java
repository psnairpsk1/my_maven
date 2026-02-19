package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List al = new ArrayList();//ArrayList is a predefined class from collection .We need that class for list to declare
		
		List<String> all = new ArrayList();
		//add to all
		
		all.add("Acer");
		all.add("Thoshiba");
		System.out.println(all);
		//add to al
		
		al.add("Dell");
		al.add("Asus");
		al.add("Hp");
		al.add("Lenovo");
		al.add("DDR4");
		
		System.out.println(al);
		
		//remove
		al.remove(4);
		System.out.println(al);
		
		//addAll
		al.addAll(all);
		System.out.println(al);
		
		//removeAll
		all.removeAll(all);
		System.out.println(all);
		
		//size
		System.out.println(al.size());
		
		//contains
		
		System.out.println(al.contains("hp"));//false will return due to case sensitive issue
		System.out.println(al.contains("Hp"));//return the true as result
		
		Iterator it = al.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());//line by line will be result
		}
		it.remove();
		System.out.println(al);//remove the last value from the list al..that is thoshiba will be removed.


	}

}
