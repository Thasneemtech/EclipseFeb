package collectionpro;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> li = new PriorityQueue<String>();
		
		li.add("10");
		li.add("Anu");
		li.add("18");
		li.add("Manu");
		li.add("20");
		li.add("minu");
		
		Iterator iter = li.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		li.remove();
		System.out.println("Remove First Element : "+li);

	}

}
