package controlstatements;

import java.util.Scanner;

public class Ifelseif_Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int mark ;
		
		System.out.println("Enter your mark :");
		mark = scan.nextInt();
		
		System.out.println("The mark is : "+mark);
		if (mark>90) {
			
			System.out.println("Grade is A");
		}
		else if (mark>=70&&mark<=89){
			
			System.out.println("Grade is B");
		}
		else if (mark>=50&&mark<=69) {
			
			System.out.println("Grade is C");
		}
		else {
			System.out.println("Grade is D");
		}

	}

}
