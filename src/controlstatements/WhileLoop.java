package controlstatements;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=20,k=31;
		while (i<j) {
			k+=(i*j);
			i*=2;
			j--;
		}
		//System.out.println("i ="+i);
		//System.out.println("k ="+k);
		//System.out.println("j ="+j);
		
		System.out.println("i ="+i+"\nj ="+j+"\nk ="+k);

	}

}
