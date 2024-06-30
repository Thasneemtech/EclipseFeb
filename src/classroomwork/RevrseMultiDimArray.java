package classroomwork;

import java.util.Scanner;

public class RevrseMultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter row size = ");
		int rowsize = scan.nextInt();
		System.out.println("Enter col size = ");
		int colsize = scan.nextInt();
		
		int arr[][] = new int[rowsize][colsize];
		
		System.out.println("Enter values : ");
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
				arr[i][j]=scan.nextInt();
				
			}
		}
		
		System.out.println("Reversed array is : ");
		for(int i=rowsize-1;i>=0;i--) {
			for(int j=colsize-1;j>=0;j--)
			System.out.print(+arr[i][j]+" ");
		}
		

	}

}
