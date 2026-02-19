package Collection;

import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();//linked list is type of class
		LinkedList<Integer> lls = new LinkedList();
		
		//add
		ll.add("Hello");
		ll.add("Red");
		ll.add("Green");
		ll.add("Blue");
		ll.add("pskS");
		System.out.println(ll);
		
		lls.add(1);
		lls.add(2);
		lls.add(3);
		lls.add(4);
		System.out.println(lls);

		//remove
		ll.remove(4);
		System.out.println(ll);
		//	//add all to add al2 to li
		ll.addAll(lls);
		System.out.println(ll);
		
	
		
		//remove all
		lls.removeAll(lls);
		System.out.println(lls);
		
		
		//get
		
		System.out.println(ll.get(2));
		//size
		System.out.println(ll.size());

		
		
		//contains--get true or false value
		System.out.println(ll.contains("green"));//returns false
		System.out.println(ll.contains("Green"));//returns true
		
	}

}
