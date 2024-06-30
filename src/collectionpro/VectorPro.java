package collectionpro;

import java.util.Vector;

public class VectorPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> li = new Vector<String>();
		
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
		
	}

}
