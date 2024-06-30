package controlstatements;

import java.util.Scanner;

public class FactorialWork_ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//program to find the factorial value 
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		number = scan.nextInt();
		
		long factorial=1;
		for(int i=1; i<=number; i++) {
			factorial *=i;
		}
		System.out.println("Factorial of "+number+" is :"+factorial);
		

	}

}
