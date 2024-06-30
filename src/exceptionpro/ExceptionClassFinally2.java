package exceptionpro;

public class ExceptionClassFinally2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Hai");
		int a[]= {1,2,3,4};
		int arr[] = null;
		
		try {     //try and catch keywords using for exception handling
			
			System.out.println(arr[1]);
			System.out.println(a[4]);
		
		}
		
		finally{
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			 }
			//Exception in thread "main" error is due to not provide "catch"
		}
		

	}

}
