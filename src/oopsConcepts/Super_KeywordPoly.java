package oopsConcepts;

class birdsss{
	int haslegs = 2;
}

class duckks extends birdsss{
	int haslegs = 4;
	
	public void display() {
		System.out.println("Super :"+super.haslegs);//to call super class   //used only inside child class
		System.out.println("Legs :"+haslegs);
	}
}

public class Super_KeywordPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duckks d = new duckks();
		d.display();
 
	}

}
