package oopsConcepts;

class Birdss1{
	
	public Birdss1() {
		System.out.println("Bird Constructor");
	}
}
	class Duckss1 extends Birdss1{
		public Duckss1() {
			System.out.println("Duck Constructor");
		}
	}


public class Superkeywrd_Constructor_Non_parameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duckss1 d = new Duckss1();

	}

}
