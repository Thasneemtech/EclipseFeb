package operators;

public class Operators_Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a
		int P = (101 + 0) / 3;
		System.out.println(P);
		
		//b
		double Q =  3.0e-6 * 10000000.1; 
		System.out.println(Q);
		
		//c
		boolean R =  true && true;
		System.out.println(R);
		
		//d
		boolean S =  false && true;
		System.out.println(S);
		
		//e
		boolean T = (false && false) || (true && true);
		System.out.println(T);
		
		//f
		boolean U = (false || false) && (true && true);
		System.out.println(U);
	}

}
