package operators;

public class Bitwise_ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3 -> 11        4 -> 100
		
		int a = 3, b = 4;
		
		System.out.println("A|B :"+(a|b)); //Bitwise OR(|)
		
		System.out.println("A&B :"+(a&b)); //Bitwise AND(&)

		System.out.println("A^B :"+(a^b)); //Bitwise XOR(^)
		
		System.out.println("~A :"+~a); //Bitwise COMPLIMENT(~) N = -(N+1)
		
		
		//Shift operator
		
		int x =4 , y= -4;
		
		System.out.println("Left shift :"+(x<<2)); 
		
		System.out.println("Right shift :"+(x>>2));

		System.out.println("Unsigned right shift :"+(x>>>2)); 
		
		
		System.out.println("Left shift :"+(y<<2));
		
		System.out.println("Right shift :"+(y>>2));

		System.out.println("Unsigned right shift:"+(y>>>2)); 
		
		
		System.out.println("Binary value of :"+Integer.toBinaryString(y));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
