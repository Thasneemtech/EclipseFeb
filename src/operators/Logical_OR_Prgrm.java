package operators;

public class Logical_OR_Prgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p = 12;
		int q = 10;
		int r = 22;
		
		boolean X = ((p + q) == r || (q + r) == p || (r + p) == q);
		
		System.out.println("Input the first number : "+p);
		System.out.println("Input the second number : "+q);
		System.out.println("Input the third number : "+r);
		System.out.println("The result is :"+X);
		
	}

}
