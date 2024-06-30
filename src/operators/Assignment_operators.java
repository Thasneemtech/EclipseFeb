package operators;

public class Assignment_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a+=b
		
		int a=10, b=20;
		
		int result = a+=b;
		
		System.out.println("Value is :"+result);
		
		//a-=b
		
		int a1=30, b1=20;
		
		int rslt = a1-=b1;
		
		System.out.println("Value is :"+rslt);
		
		
		//a*=b
		 
		int x=30,y=10;
		
		int answer = x*=y;
		
		System.out.println("Value is :"+answer);
		
		
		//q/=k
		
		int q=10,k=3;
		
		int result1 = q/=k;
		
		System.out.println("Value is :"+result1);
		
		
		//c%=a
		
		int c=30;a=10;
		
		c%=a;          //another way
		
		System.out.println(c);
		
		
		//Increment operator
		
		//Postfix
		
		int A = 20;
		
		int x1=A++;
		
		System.out.println("x1 = "+x1);
		System.out.println("A = "+A);
		
		//prefix
		
		int A1 = 21;
		
		int x2=++A1;
		
		System.out.println("x2 = "+x2);
		System.out.println("A1 = "+A1);
		
		//Decrement
		
		//postfix
		
		int A2 = 22;
		
		int Y1=A2--;
		
		System.out.println("Y1 = "+Y1);
		System.out.println("A2 = "+A2);
		
		//PREFIX
		
		int A3 = 21;
		
		int Y2=--A3;
		
		System.out.println("Y2 = "+Y2);
		System.out.println("A3 = "+A3);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
