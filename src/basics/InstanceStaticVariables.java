package basics;

public class InstanceStaticVariables {
	
	//instance variable
	//variable declaration
	String studname;
	int age;
	
	//static variable
	//variable declaration with initialization
	static String course = "Manual Tester";
	

	public static void main(String[] args) {    //start
		// TODO Auto-generated method stub

		
		//object creation
		InstanceStaticVariables stud1 = new InstanceStaticVariables();
		
		System.out.println("Student name : "+(stud1.studname = "Anju"));
		System.out.println("Student age : "+(stud1.age = 25));
		System.out.println("Course : "+course);
		
		System.out.println();
		
		
		InstanceStaticVariables stud2 = new InstanceStaticVariables();
		
		System.out.println("Student name : "+(stud2.studname = "Anu"));
		System.out.println("Student age : "+(stud2.age = 27));
		System.out.println("Course : "+course);
		
		System.out.println();
		
		
		InstanceStaticVariables stud3 = new InstanceStaticVariables();
		
		System.out.println("Student name : "+(stud3.studname = "manu"));
		System.out.println("Student age : "+(stud3.age = 30));
		System.out.println("Course : "+(course = "Automation tester"));// course value change
		
		System.out.println();
		
		
		
		InstanceStaticVariables stud4 = new InstanceStaticVariables();
		
		System.out.println("Student name : "+(stud4.studname = "aadhi"));
		System.out.println("Student age : "+(stud4.age = 31));
		System.out.println("Course : "+course);
		
		System.out.println();
		
	}

}
