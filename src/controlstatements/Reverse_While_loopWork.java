package controlstatements;

import java.util.Scanner;

public class Reverse_While_loopWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scan.nextInt();
		
		int Lastdigit;//remainder
		int rev=0;//num=123
		while(num>0) {
			Lastdigit=num%10;//123%10=3,12%10=2,1%10=1
			rev=rev*10 + Lastdigit;//0+3=3,3*10+2=32,32*10+1=321
			num=num/10;//123/10=12,12/10=1,1/10=0
		}
		System.out.println(rev);
		

	}

}