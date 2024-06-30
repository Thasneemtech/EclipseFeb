package classroomwork;

import java.util.Scanner;

public class MaxMinMethodConstructor {
	
	public void maxMin(int x, int y, int z) {
		
		if(x>y)
			if(x>z)
			{
				System.out.println("The greatest :"+x);
			}
		if(y>x)
			if(y>z)
			{
				System.out.println("The greatest :"+y);
			}
		if(z>x)
			if(z>y)
			{
				System.out.println("The greatest :"+z);
			}
			else {
				System.out.println();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1st input : ");
		int x = scan.nextInt();
		
		System.out.println("2nd input : ");
		int y = scan.nextInt();
		
		System.out.println("3rd input : ");
		int z = scan.nextInt();
		
		MaxMinMethodConstructor ob = new MaxMinMethodConstructor();
		ob.maxMin(x,y,z);

	}

}
