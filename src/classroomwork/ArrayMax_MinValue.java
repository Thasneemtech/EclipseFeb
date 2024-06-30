package classroomwork;

import java.util.Scanner;

public class ArrayMax_MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int num = scan.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the "+num+" elements : ");
		
		for(int i=0;i<num;i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<num;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("Maximum value of array is : "+max);
		System.out.println("Minimum value of array is : "+min);
		
		
			
		

	}

}
