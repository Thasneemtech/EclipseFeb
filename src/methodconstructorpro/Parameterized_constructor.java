package methodconstructorpro;

public class Parameterized_constructor {
	int length, breadth;
	int area;
	
	public Parameterized_constructor(int l,int b) {
		// TODO Auto-generated constructor stub
		area = l*b;
		System.out.println("Area is :"+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_constructor ob = new Parameterized_constructor(5, 8);

	}

}
