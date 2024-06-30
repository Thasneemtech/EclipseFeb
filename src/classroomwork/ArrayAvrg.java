package classroomwork;

import java.util.Scanner;

public class ArrayAvrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		System.out.println("Enter the values : ");
		for(int i=0;i<num;i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum = 0;
		for(int i=0;i<num;i++) {
			sum += arr[i];
		}
		
		double average = (double) sum/num;
		System.out.println("Average value of an array : "+average);

	}
}
