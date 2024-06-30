package classroomwork;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter values are : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
			
		}
		System.out.println("Reversed array is : ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(+arr[i]+" ");
		}
		

	}

}
