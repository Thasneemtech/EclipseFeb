package arraypro;

import java.util.Scanner;

public class Array_work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using scannerclass
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size = ");
		int size = scan.nextInt();
		
		int marks[]=new int[size];
		
		//entering values
		System.out.println("Enter values : ");
		for(int i=0;i<marks.length;i++) {
			marks[i]=scan.nextInt();
		}
		for(int i=0;i<marks.length;i++) {
			System.out.println("marks["+i+"]"+"="+marks[i]);

	}


	}

}
