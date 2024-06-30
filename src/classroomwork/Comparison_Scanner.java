package classroomwork;

import java.util.Scanner;

public class Comparison_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first integer :");
		int f_n = scan.nextInt();
		System.out.println("Input second integer :");
		int s_n = scan.nextInt();
				
		System.out.println(f_n + " != " + s_n);
		System.out.println(f_n + " < " + s_n);
		System.out.println(f_n + " <= " + s_n);
	}

}
