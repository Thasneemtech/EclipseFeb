package exceptionpro;

public class WithFunction {
	
	public static void div() {
		int a=10,b=0,c;
		c = a/b;   //we can given try & catch here also
		System.out.println("Div is :"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		div();
		}
		catch(Exception e) {
		   System.out.println(e);
		}
	}

}
