package basics;

public class LocalVariables {

	
	public void display() {
		int num1 = 10;
		System.out.println("Number is : "+num1);
		num1 = 20;
		System.out.println("New number is :"+num1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalVariables obj = new LocalVariables();// ctrl + space variables automatically display
		obj.display();
	}

}
