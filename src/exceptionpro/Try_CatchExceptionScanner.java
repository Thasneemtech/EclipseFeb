package exceptionpro;

import java.util.Scanner;

public class Try_CatchExceptionScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		try {
			num = scan.nextInt();
		}
		
		catch(Exception e){
			System.out.println(e);
			
		}
		System.out.println("num is :");

	}

}
