package exceptionpro;

public class Votting {
	private static void check(int age) throws ArithmeticException{
		if (age < 18) {
			throw new ArithmeticException("Age is not valid"); //in Votting there should be exception error must shown for that here using throw and throws 
		}
		else {
			System.out.println("Welcome....");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	try {
			check(10);
		//}
		//catch(Exception e) {
		//	System.out.println(e);
		//}
	}

}
