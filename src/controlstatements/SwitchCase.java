package controlstatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1.Safari \n 2.Edge \n 3.Chrome");
		Scanner scan = new Scanner(System.in);
		int browser;
		System.out.println("Enter the option :");
		browser = scan.nextInt();
		
		switch(browser) {
		case 1 :
			System.out.println("The browser is Safari");
			break;
		case 2 :
			System.out.println("The browser is Edge");
			break;
		case 3 :
			System.out.println("The browser is Chrome");
			break;
			default :
				System.out.println("Browser is not selected");
		}
		
		

	}

}
