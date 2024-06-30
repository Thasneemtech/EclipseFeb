package methodconstructorpro;

public class Copy_Constructor {
	int length;
	int breadth;
	int area;
	public Copy_Constructor(int l,int b) {
		// TODO Auto-generated constructor stub
		area=l*b;
		System.out.println("area is :"+area);
	}
	public void display() {
		System.out.println("Area is :"+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_Constructor ob = new Copy_Constructor(2, 6);
		ob.display();
		
		Copy_Constructor ob1 = ob;  //copy constructor
		ob1.display();

	}

}
