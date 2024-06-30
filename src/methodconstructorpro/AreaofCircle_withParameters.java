package methodconstructorpro;

public class AreaofCircle_withParameters {
	
	//Function with no return type with parameter
	
			public void areaOfCircle1(double pi,int r) {
			double area = pi*r*r;
			
			System.out.println("Area of Circle : "+area);
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaofCircle_withParameters ob= new AreaofCircle_withParameters();
		ob.areaOfCircle1(3.14,2);

	}

}
