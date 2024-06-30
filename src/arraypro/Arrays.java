package arraypro;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration
		int marks[]=new int[5];
		
		//initialization
		marks[0]=50;
		marks[1]=90;
		marks[2]=31;
		marks[3]=60;
		marks[4]=80;	
		
		System.out.println("English : "+marks[0]);//random access
		
		System.out.println();//for space
		
		//i==>index(starts 0    endsize-1)
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		System.out.println();
		
		//declaration with initialization
		int arr[]= {1,2,3,4,5,6};
		
		//for(int data : arr) {      /*for-each loop*/for accessing same data types-for-each loop
			//System.out.println(data);
		//
		//}
		
		for(int i=0;i<6;i++) {
			System.out.println("arr["+i+"]"+"="+arr[i]);
		}
		
		
	}

}
