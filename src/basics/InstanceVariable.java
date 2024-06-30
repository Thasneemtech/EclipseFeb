package basics;

public class InstanceVariable {
	
	int num = 10;
	
	//public void display() {
	//system.out.println("Number is :" +num);
	// }

	public static void main(String[] args) {    //main method
		// TODO Auto-generated method stub

		InstanceVariable ob = new InstanceVariable();
		
		ob.num = 20;
		System.out.println(ob.num);
		
		//ob.display();
	}

}
