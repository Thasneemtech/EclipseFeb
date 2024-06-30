package operators;

public class Work_Bitwise_Ternary_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Logical_operator
		
		int num1=5,num2=20;
		
		//boolean a=num1>num2 || num2>num1;
		//boolean res=!a;
		
		boolean a=num1>num2;
		boolean b=num2>num1;
		
		boolean res=!(a||b);
		System.out.println("result is ="+res);
		
		boolean res1=!(a&&b);
		System.out.println("result is ="+res1);
		
		boolean res2=!(a||b)&&(a||b);
		System.out.println("result is ="+res2);
		
		boolean res3=!(a&&b)||(a&&b);
		System.out.println("result is ="+res3);
	
		
	//Ternary_operator
		
		int num=10;
		int res4 = (num%2 == 0) ? 0 : 1;
		System.out.println("result is ="+res4);
		
		int number=10;
		String result=(number>0) ? "Positive Number" : "Negative Number";
		System.out.println("result is ="+result);	
		
	//Bitwise_operator
		
		int x1=10,x2=11;
		
		int X=x1|x2;
		System.out.println("result of X ="+X);
		
		int Y=x1&x2;
		System.out.println("result of Y ="+Y);
		
		int Z=x1^x2;
		System.out.println("result of Z ="+Z);
		
		System.out.println("~P ="+~x1);
	}

}
