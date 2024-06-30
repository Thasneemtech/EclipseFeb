package controlstatements;

import java.util.Scanner;

public class If_Elseif_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=scan.nextInt();
		
		System.out.println("The number is : "+num);
		if(num>100) {
			System.out.println("greater than 100");
		}
		else if(num<100) {
			System.out.println("less than 100");
		}
		else {
			System.out.println("equal to 100");
		}
		
		
	}
	

}
