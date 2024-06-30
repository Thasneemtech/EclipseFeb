package oopsConcepts;

	public class Without_Thiskeyword {
		
		//Student details
		//Instance Variable
		
		String st_name;
		int r_num;
		float T_mark;
		
		public Without_Thiskeyword(String st_name,int r_num,float T_mark) {
			// TODO Auto-generated constructor stub
			st_name = st_name;
			r_num = r_num;
			T_mark = T_mark;
		}
		public void display() {
			System.out.println("Student name = "+st_name);
			System.out.println("Student roll num = "+r_num);
			System.out.println("Student total mark= "+T_mark);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Without_Thiskeyword ob = new Without_Thiskeyword("Anu", 1, 55.87f);
			ob.display();

		}

	}


	