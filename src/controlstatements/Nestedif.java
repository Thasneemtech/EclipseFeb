package controlstatements;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value : ");
		num = scan.nextInt();
		
		System.out.println("Value :"+num);
		if (num<=100) {
			System.out.println("Print less than 100");
			if (num>=50) {
				System.out.println("Print greater than 50");
			}
			else {
				System.out.println("Print less than 50");
			}
		}
		else {
			System.out.println("Print greater than 100");
		}

	}

}
