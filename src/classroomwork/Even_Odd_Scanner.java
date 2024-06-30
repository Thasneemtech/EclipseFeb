package classroomwork;

import java.util.Scanner;

public class Even_Odd_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a number :");
		int num=scan.nextInt();
		
		String res = (num % 2 == 0) ? ("1") : ("0d");
		System.out.println(""+res);

	}

}
