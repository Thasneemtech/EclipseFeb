package controlstatements;

import java.util.Scanner;

public class Nested_SwitchClswrk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.School of Computer science");
		System.out.println("a. Department of Informatics \n b.Department of Machine Learning");
		System.out.println("2.School of Business");
		System.out.println("a. Department of Commerce \n b.Department of Purchasing ");
		System.out.println("3.School of Engineering");
		System.out.println("a.Department of Mechanical Engineering \n b.Department of Mechatronics Engineering");
		
		String School;
		String Department;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your School :");
		School = scan.next();
		System.out.println("enter your Department :");
		Department = scan.next();
		
		switch(School) {
		case "1":
			System.out.println("1.School of Computer Science");
			switch(Department) {
			case"a" : System.out.println("a.Department of Informatics");
			break;
			case"b" : System.out.println("b.Department of Machine Learning");
			break;
			}
			break;
			
		case "2" :
			System.out.println("2.School of Business");
			switch(Department) {
			case "a" : System.out.println("a.Department of Commerce");
			break;
			case "b" : System.out.println("b.Department of Purchasing");
			break;
			}
			break;
			
		case "3" :
			System.out.println("3.School of Engineering");
			switch(Department) {
			case "a" : System.out.println("a.Department of Mechanical Engineering");
			break;
			case "b" : System.out.println("b.Department of Mechatronics Engineering");
			}
			break;
		
		}
		
		
	}

}
