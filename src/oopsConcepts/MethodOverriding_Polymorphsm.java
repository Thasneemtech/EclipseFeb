package oopsConcepts;

//base class
class Methods{
	
	public void add() {
		int a = 20,b = 40;
		System.out.println(a+b);
	}
}

//derived class
public class MethodOverriding_Polymorphsm {
	
	public void add() {
		int a = 22, b = 30;
		System.out.println(b-a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverriding_Polymorphsm ob = new MethodOverriding_Polymorphsm(); //here child class having priority more than base class.object aarkano create cheyyunnath ath o/p varm
		//Methods obj = new MethodOverriding_Polymorphsm(); //called data binding
		
		ob.add();
	}

}
