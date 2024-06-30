package methodconstructorpro;

public class FnctnWithReturntypeAndParameter {
	
	public float areaOfRectangle(int l,int b) {
		float area = l*b;
		return l*b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FnctnWithReturntypeAndParameter ob = new FnctnWithReturntypeAndParameter();
		ob.areaOfRectangle(4, 5);
		System.out.println("The area is "+(ob.areaOfRectangle(4, 5)));

	}

}
