package oopsConcepts;

abstract class Vehicle{
	
	public abstract void start(); //Declaration
	
	public void fuel() {
		System.out.println("Petrol");
	}
}

class Train extends Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Button Start");
		
	}
	
}

class Car extends Vehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Abstraction_PolyPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.fuel();
		c.start();
		
		Train tr = new Train();
		tr.start();
		
		

	}

}
