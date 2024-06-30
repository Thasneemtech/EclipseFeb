package methodconstructorpro;

public class Fnctn_With_Returntype_NoParameter {
	
	//function with return type and no parameter
	//area of rectangle l*b
	
	public float areaOfRectangle() {
		int l=3;
		int b=6;
		float area = l*b;
		return area;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fnctn_With_Returntype_NoParameter ob = new Fnctn_With_Returntype_NoParameter();
		float newarea =ob.areaOfRectangle();
		System.out.println(newarea);
		
		//System.out.println("The value is "+(ob.areaOfRectangle()));
	}

}
