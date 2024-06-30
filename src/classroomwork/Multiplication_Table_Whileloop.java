package classroomwork;

public class Multiplication_Table_Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		int Mul = 0;
		System.out.println("Multiplication table of 24 is");
		while(i<=10) {
			Mul=24*i;
			System.out.println(24+ " * " +i+" :"+Mul );
			i++;
		}
		System.out.println();
		
		int j=1;
		int Mul1=0;
		System.out.println("Multipication table of 50 is");
		while(j<=10) {
			Mul1=50*j;
			System.out.println(50+ " * "+j+" : "+Mul1);
			j++;
		}
		System.out.println();
		
		int k=1;
		int Mul2=0;
		System.out.println("Multipication table of 29 is");
		while(k<=10) {
			Mul2=29*k;
			System.out.println(29+ " * "+k+" : "+Mul2);
			k++;
		}
	}
}
