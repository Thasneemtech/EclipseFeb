package methodconstructorpro;

public class Non_ParameterizedConstructor {
	//area of rectangle = l*b;
	int length,bridth,area;
	
	public Non_ParameterizedConstructor() {
		// TODO Auto-generated constructor stub
		length=5;
		bridth=8;
		area = length*bridth;
		System.out.println("Area is :"+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_ParameterizedConstructor ob = new Non_ParameterizedConstructor();

	}

}
