package classroomwork;

import java.util.Scanner;

public class If_ElseClswrk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		int n2;
		int n3;
		int n4;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first number :");
		n1 = scan.nextInt();
		System.out.println("Input second number :");
		n2 = scan.nextInt();
		System.out.println("Input third number :");
		n3 = scan.nextInt();
		System.out.println("Input fourth number :");
		n4 = scan.nextInt();
		
		if(n1 == n2 && n2 == n3 && n3 == n4 ) {
			System.out.println("Numbers are equal");
		}
		else {
			System.out.println("Numbers are not equal!");
		}

	}

}
