package collectionpro;

import java.util.*;

public class List_Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List li = new ArrayList();
		
		List li1 = new ArrayList();
		
			li.add(10);
			li.add("Anu");
			li.add("Hai");
			li.add(12);
			li.add(10);
			
			System.out.println("Elements are : "+li);
			
			li.add("Manu");
			
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
