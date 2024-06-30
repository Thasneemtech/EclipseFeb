package collectionpro;

import java.util.Stack;
import java.util.Vector;

public class StackPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> li = new Stack<String>();
		
		li.push("10");
		li.push("Anu");
		li.push("Hai");
		li.push("12");
		li.push("10");
		
		System.out.println("Elements are : "+li);
		
		li.push("Manu");
		li.push("Anju");
		
		System.out.println("Elements are : "+li);
		
		System.out.println("Top elements are : "+li.peek());
		
		li.pop();
		System.out.println(li);
		System.out.println("Top elements are : "+li.peek());
		

	}

}
