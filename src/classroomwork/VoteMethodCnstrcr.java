package classroomwork;

import java.util.Scanner;

public class VoteMethodCnstrcr {
	
	
	public void vote(int age) {
		
		if(age>18) {
			System.out.println("You are eligible to vote");
		}
		else {
			int yearstoWait = 18-age;
			System.out.println("Sorry,You can vote after "+yearstoWait+" years");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an age : ");
		int age = scan.nextInt();
		VoteMethodCnstrcr ob = new VoteMethodCnstrcr();
		ob.vote(age);

	}

}
