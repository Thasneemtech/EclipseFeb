package methodconstructorpro;

import java.util.Scanner;

public class BuiltinFun_Scannerclass {
	
	public void evenOdd(int num) {
		
		if (num%2==0){
		System.out.println("Number is even");		
		}
		else
		{
		System.out.println("Number is odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an number : ");
		int num = scan.nextInt();
		BuiltinFun obj = new BuiltinFun();
		obj.evenOdd(num);

	}

}
