package methodconstructorpro;

public class AreaofCircle {
	
	//Function with no return type and no parameter
	public void areaOfCircle() {
		
		double pi=3.14;
		int r=2;
	    double area;
		area=pi*r*r;
		
		System.out.println("Area of Circle is : "+area);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaofCircle ob= new AreaofCircle();
		ob.areaOfCircle();
		
		
		

	}

}
