package oopsConcepts;

public class Student_details_Encapsulation {
	
	private String st_name;
	public String email_id;
	public String password;
	
	public void setName(String st_name) {  //set use for changing the variable
		
		this.st_name = st_name;
	}
	
	public String getName() { //get used for reading the variable
		return st_name;
	}
	
	public void setEmail(String email_id) {
		
		this.email_id = email_id;
		
	}
	
	public String getEmail() {
		
		return email_id;
	}
	
	public void setPassword(String password) {
		
		this.password = password;
	}
	
	public String getPassword() {
		
		return password;
	}

}
