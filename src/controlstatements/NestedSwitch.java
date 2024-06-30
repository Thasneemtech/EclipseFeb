package controlstatements;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("1.UG");
		System.out.println("a. BCA \n b. B.com \n c. Bsc");
		System.out.println("2.PG");
		System.out.println("a. MCA \n b. M.com \n c. Msc");
		
		Scanner scan=new Scanner(System.in);
		int option;
		String course;
		System.out.println("Enter your option ");
		option=scan.nextInt();
		System.out.println("Enter your course ");
		course=scan.next();
	
		switch(option) {
			case 1:
				System.out.println("1.UG");
				switch (course) {
				case "a" : System.out.println("a. BCA");
				break;
				case "b" : System.out.println("b. B.com");
				break;
				case "c" : System.out.println("c. Bsc");
				break;
				default : System.out.println("Invalid option");
				}
			break;
			case 2 :
				System.out.println("1.PG");
				switch (course) {
				case "a" : System.out.println("a. MCA");
				break;
				case "b" : System.out.println("b. M.com");
				break;
				case "c" : System.out.println("c. Msc");
				break;
				default : System.out.println("Invalid option");
				}
				break;
				
		}
		
		

	}

}
