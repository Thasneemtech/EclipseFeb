package classroomwork;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an year : ");
		int year = scan.nextInt();
		
		if((year%4==0) || (year%100!=0) && (year%400==0)) {
			
			System.out.println("Leap year");
		}
		else  {
			System.out.println("Not a Leap year");
		}
		

	}

}
