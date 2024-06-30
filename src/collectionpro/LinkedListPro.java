package collectionpro;

import java.util.*;
//import java.util.Iterator;
//import java.util.List;

public class LinkedListPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> li = new LinkedList<String>();
		
		List li1 = new ArrayList();
		
		li.add("10");
		li.add("Anu");
		li.add("Hai");
		li.add("12");
		li.add("10");
		
		System.out.println("Elements are : "+li);
		
		li.add("Manu");
		
		System.out.println("Data's are : "+li);
		for(String data : li) {
			System.out.println(data);
		}
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		li.remove(2);
		System.out.println(li);
		
		li1.addAll(li);
		System.out.println("New list : "+li1);
		
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}





	}

}
