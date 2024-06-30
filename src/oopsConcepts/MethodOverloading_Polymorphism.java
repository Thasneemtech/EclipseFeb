package oopsConcepts;

public class MethodOverloading_Polymorphism {
	public void add() {
		int a,b,c;
		a = 10; b = 20;
		c = a+b;
		System.out.println("Sum is : "+c);
	}
	
	public void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b,int c) {
		System.out.println("Sum :"+(a+b+c));
	}
	public void add(int a,float b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading_Polymorphism ob = new MethodOverloading_Polymorphism();
		ob.add(7, 9, 10);

	}

}
