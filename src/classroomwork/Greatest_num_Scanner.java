package classroomwork;

import java.util.Scanner;

public class Greatest_num_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the 1st number :");
		int x=scan.nextInt();
		
		System.out.println("Input the 2nd number :");
		int y=scan.nextInt();
		
		System.out.println("Input the 3rd number :");
		int z=scan.nextInt();
		
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

}
