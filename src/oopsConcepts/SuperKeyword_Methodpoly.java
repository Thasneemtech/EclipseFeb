package oopsConcepts;

class birdss{
	
	public void display() {  //method for display super class
		System.out.println("Legs : 2");
	}
}

class ducks extends birdss{
	
	public void display() {
		
		super.display(); //super class calling
		System.out.println("Legs : 2");
	}
}

public class SuperKeyword_Methodpoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duckks d = new duckks();
		d.display();
 

	}

}
