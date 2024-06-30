package operators;

public class Logical_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=2, num2=5 ;
		
		//Logical and &&
		
		boolean x1 = num1>num2 && num2<num1;
		System.out.println("value :"+(num1>num2));
		System.out.println("value :"+(num2<num1));
		System.out.println("x1 :"+x1);
		
		//Logical OR ||
		
		boolean y = num1==num2 || num2!=num1;
		System.out.println("y :"+y);
		
		//Logical NOT!
		
		boolean z = !(num1!=num2);
		System.out.println("z :"+z);

	}

}
