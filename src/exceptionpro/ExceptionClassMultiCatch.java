package exceptionpro;

public class ExceptionClassMultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hai");
		int a[]= {1,2,3,4};
		int arr[] = null;
		
		try {     //try and catch keywords using for exception handling
			
			System.out.println(arr[1]);
			System.out.println(a[4]);
		
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		catch(NullPointerException e1) {
			System.out.println("Array is Null");
		}
		
		catch(Exception e2) {           //if we know the type of exception then it can use instead of "exception e" 
			System.out.println(e2);
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}


	}

}
