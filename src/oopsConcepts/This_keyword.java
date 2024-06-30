package oopsConcepts;

public class This_keyword {
	
	//Student details
	//Instance Variable
	
	String st_name;
	int r_num;
	float T_mark;
	
	public This_keyword(String st_name,int r_num,float T_mark) {
		// TODO Auto-generated constructor stub
		this.st_name = st_name;
		this.r_num = r_num;
		this.T_mark = T_mark;
	}
	public void display() {
		System.out.println("Student name = "+st_name);
		System.out.println("Student roll num = "+r_num);
		System.out.println("Student total mark= "+T_mark);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_keyword ob = new This_keyword("Anu", 1, 55.87f);
		ob.display();

	}

}
