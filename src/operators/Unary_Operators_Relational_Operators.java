package operators;

public class Unary_Operators_Relational_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Unary Operators
		
		//unary minus(-)
		
		int a = 10;
		//a=-a;
		System.out.println("Unary minus is :"+(-a));
		
		//NOT Operator(!)
		
		boolean value = false;
		System.out.println("Value is :"+(!value));
		
		//Increment operators
		
		int num = 6;
		num++;
		System.out.println("Post increment Value is :"+num);
		
		int num1 = 6;
		System.out.println("Pre increment Value is :"+(++num1));
		
		//decrement operators
		
		int num2 = 5;
		num2--;
		System.out.println("post decrement Value is :"+num2);
		
		int num3 = 4;
		System.out.println("pre decrement Value is :"+(--num3));
		
		//bitwise complement
		
		int b = 10;
		System.out.println("Value is :"+(~b));
		
		
		//Relational Operators
		
		int x = 10, y = 20;
		
		boolean result = x<y;
		
		System.out.println("lessthan is :"+result );
		
		
		
		
		

	}

}
