package oopsConcepts;

class Humans{
	
	public Humans() {
		System.out.println("Humans has 2 legs");
	}
	public Humans(int haslegs) {
		System.out.println("Legs :"+haslegs);
		
	}
}
class Animals extends Humans{
	
	public Animals() {
		
		super(2);
		System.out.println("Animals has 4 legs");
		
		
	}
}

public class SuperKeywrd_ConstrctParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals A = new Animals();

	}

}
