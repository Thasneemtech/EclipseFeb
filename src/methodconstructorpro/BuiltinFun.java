package methodconstructorpro;

import java.util.Scanner;

public class BuiltinFun {
	
	//access_modifier return_type method_name(parameter list)
			public void evenOdd(int num) {
				
			if (num%2==0){
			System.out.println("Number is even");		
			}
			else {
			System.out.println("Number is odd");
			}
		}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuiltinFun obj = new BuiltinFun();
		obj.evenOdd(10);
		
		//System.out.println("The maximum number is : "+Math.max(1, 2));
		
		
	}

}
