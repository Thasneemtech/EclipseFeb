package operators;

public class Works {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A%b
		
		int A = 20 , b = 4;
		
		int mod = A%b;
		
		System.out.println("mod : "+mod);
		
		//System.out.println("mod : "+(A%b))
		
		
		//num / c
		
		int num = 27 , c = 3;
		
		int div = num / c;
		
		System.out.println("div :"+div);
		
		//4 / 2 + 8 * 4 - (5 + 2) % 3

		int X = 4 / 2 + 8 * 4 - (5 + 2) % 3;
		
		System.out.println("X :"+X);
		
		
		//X + Z / X + (Z % Y) * (Z - X)
		
		int X1 = 3, Y = 4, Z = 5;

		int result = X1 + Z / X1 + (Z % Y) * (Z - X1);
		
		System.out.println("result is :"+result);
		
		//z/x+y*x-(y+x)%z
		
		int x=10,y=20,z=22;
		
		int r1 = z/x+y*x-(y+x)%z;
		
		System.out.println("result is :"+r1);
		
		
		
		
		
		
	}

}
