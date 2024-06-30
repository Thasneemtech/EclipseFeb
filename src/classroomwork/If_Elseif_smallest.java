package classroomwork;

import java.util.Scanner;

public class If_Elseif_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Value of a is : ");
		a= scan.nextInt();
		
		System.out.println("value of b is : ");
		b= scan.nextInt();
		
		System.out.println("value of c is : ");
		c= scan.nextInt();
		
		if(a<b && a<c) {
			System.out.println("print smallest a");
		}
		else if(b<a && b<c) {
			System.out.println("print smallest b");
		}
		else {
			System.out.println("print smallest c");
		}
		

	}

}
