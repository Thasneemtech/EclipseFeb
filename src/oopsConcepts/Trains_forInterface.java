package oopsConcepts;

public class Trains_forInterface implements  Vehicles_Interface_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trains_forInterface tr = new Trains_forInterface();
		tr.fuel();
		
		Vehicles_Interface_Abstract v = new Trains_forInterface(); //up_casting
	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		
		System.out.println("Petrol");
		
	}

}
