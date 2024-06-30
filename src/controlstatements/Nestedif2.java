package controlstatements;

import java.util.Scanner;

public class Nestedif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		float weight;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age :");
		age = scan.nextInt();
		
		System.out.println("Enter the weight :");
		weight = scan.nextFloat();
		
		System.out.println("Age is : "+age);
		System.out.println("weight is : "+weight);
		
		if(age>=18) {
			if(weight>=50) {
				System.out.println("Print eligible to donate blood");	
			}
		}
		else {
			System.out.println("Print not eligible");
		}
	}

}
