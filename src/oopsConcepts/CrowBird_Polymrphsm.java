package oopsConcepts;

class birdd{
	public void haslegs() {
		System.out.println("Bird has 2 legs");
	}
	
	public void haslegs(int no_legs) {
		System.out.println("No of legs :"+no_legs);
	}
	public void sound() {
		System.out.println("tweet...tweet...");
	}
}

public class CrowBird_Polymrphsm extends birdd{
	
	public void sound() {
		System.out.println("kaa...kaa....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CrowBird_Polymrphsm ob = new CrowBird_Polymrphsm();
		ob.haslegs(2);//method overloading
		ob.sound();//method overriding
	}

}
