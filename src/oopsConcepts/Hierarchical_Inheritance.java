package oopsConcepts;

class Phones{
	
	int price;
	String color;
	
	public void accessories(){
		System.out.println("Ear phones are free");
	}
}

class Android extends Phones{
	
	String Weight ="2.47 inches";
	String model = "Samsung";
	
	public void feature() {
		System.out.println("Calling...");
	}	
}

class IOS extends Phones{
	
	String model = "iphone";
	String connector;
	
	public void feature1() {
		System.out.println("High camera quality");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Android ob = new Android();
		
		System.out.println("price is :"+(ob.price = 50000));
		System.out.println("color is :"+(ob.color = "white"));
		System.out.println("weight is ="+ob.Weight);
		System.out.println("model is ="+ob.model);
		ob.accessories();
		ob.feature();
		
		IOS ob1 = new IOS();
		
		System.out.println("price is :"+(ob1.price = 50000));
		System.out.println("color is :"+(ob1.color = "white"));
		System.out.println("model is ="+ob1.model);
		System.out.println("connector is ="+(ob1.connector="c type"));
		ob1.accessories();
		ob1.feature1();		
		

	}

}
