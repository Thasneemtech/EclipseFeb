package classroomwork;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner object_name/reference_name = new Scanner(System.in);
		
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Enter your name : ");
		//name = scan.nextLine();
		name = scan.next();
		System.out.println(name);

	}

}
