package controlstatements;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		n = scan.nextInt();
		
		int firstTerm = 0, secondTerm =1;
		System.out.println("Fibonacci series upto "+n+" terms :");
		for (int i=1;i<=n;i++) {
			System.out.println(firstTerm+" ");
			int next=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=next;
			
				
		}

	}

}
