package oopsConcepts;

//Parent class
class Luminar{
	
	//data field/variable
	String  Address = "Luminar Calicut";
	String Course="software testing";
	String Time;
	
	
	//methods
	public void aim() {
		System.out.println("Aim is 100% placement");
	}	
}

//Child class
class Students extends Luminar{
	int id = 1;
	int mark = 80;
	String qualification = "Btech";
	
	public void duty() {
		System.out.println("Aim is learning");
	}
}

public class SingleInheritance {   //here we use main class as students

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students ob = new Students();
		System.out.println("id is :"+(ob.id));
		System.out.println("mark is :"+(ob.mark));
		System.out.println("qualification is :"+(ob.qualification));
		System.out.println("Address is :"+(ob.Address));
		System.out.println("course is :"+(ob.Course));
		System.out.println("Time is :"+(ob.Time="10.30-12.30"));
		ob.duty();
		ob.aim();
		

	}

}
