package oopsConcepts;

public class StudentDisplay_Encapsulatn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_details_Encapsulation stud = new Student_details_Encapsulation();
		stud.setName("Abay");
		System.out.println("Student Name :"+stud.getName());
		
		stud.setEmail("Abay123@gmail.com");
		System.out.println("Student email id :"+stud.getEmail());
		
		stud.setPassword("Abay@123");
		System.out.println("Student Password :"+stud.getPassword());
		
	}

}
