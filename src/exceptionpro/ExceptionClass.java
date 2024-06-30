package exceptionpro;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hai");
		int a[]= {1,2,3,4};
		try {                          //try and catch keywords using for exception handling
			System.out.println(a[4]);
		}
		catch(Exception e) {           //if we know the type of exception then it can use instead of "exception e" 
			System.out.println(e);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
