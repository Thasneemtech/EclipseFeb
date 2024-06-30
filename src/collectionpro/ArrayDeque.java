package collectionpro;

public class ArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.ArrayDeque<String> li = new java.util.ArrayDeque<String>();

		li.add("10");
		li.add("Anu");
		li.add("18");
		li.add("Manu");
		li.add("20");
		li.add("minu");

		System.out.println(li);
		
		li.addFirst("Hai");
		System.out.println(li);
		
		li.addLast("abc");
		System.out.println(li);
		li.poll();  //1st value remove
		System.out.println("Remove 1st Element : "+li);
		
		li.pollFirst();
		System.out.println(li);
		
		li.pollLast();
		System.out.println(li);
		
	
		System.out.println("Print 1st element : "+li.peekFirst());
		System.out.println("Print 1st element : "+li.peekLast());
		
	}

}
