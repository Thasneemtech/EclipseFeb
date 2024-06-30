package oopsConcepts;

class Company{
	
	String comp_name;
	String time;
}

class employee extends Company{
	
	int emp_id;
	String emp_name;
	
}

class  developer extends employee{
	int salary;
	int pf;
}
public class Multi_Level_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		developer ob = new developer();
		System.out.println("Company name is :"+(ob.comp_name="Google"));
		System.out.println("Company time is :"+(ob.time="10.30-4.00"));
		System.out.println("Employee id is :"+(ob.emp_id=1));
		System.out.println("Employee name is :"+(ob.emp_name="Thasneem"));
		System.out.println("developer salary is :"+(ob.salary=25000));
		System.out.println("developer pf is :"+(ob.pf));
		

	}

}
