package operators;

public class Arithmetic_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+ - / * %
		
		int num1 = 20, num2 = 10;
		
		int sum,sub,mul,div,mod;
		
		sum = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		mod = num1%num2;
		
		System.out.println("Sum : "+sum+"\nSub : "+sub+"\nMul : "+mul+"\nDiv : "+div+"\nMod : "+mod);
		
		
		int x = 2 + 3 - 4 * 5 % 8 / 4 ;
		 
		System.out.println(x);
		
	/* Here Answer is 4
	  
	  2 + 3 -20 % 8 /4
	  
	  2 + 3 - 4 / 4
	  
	  2 + 3 - 1
	 
	  4
	  
	 */
		 
		
				
		 
		
	}

}
