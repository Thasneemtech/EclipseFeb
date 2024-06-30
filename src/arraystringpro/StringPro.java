package arraystringpro;

public class StringPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char array
		char myarr[] = {'H','E','L','L','O'};
		System.out.println(myarr);
		for(int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
		
		//string literals
		
		String val = "Arun";
		System.out.println(val);
		String val1 = "Arun";
		System.out.println(val1);
		System.out.println(val==val1);
		String val2 = "Anu";
		val2 = val2+"Gopi";
		System.out.println(val2);
		
		//new keyword
		String name = new String ("Arun");
		System.out.println(val==name);
		
		System.out.println(val.equals(name));

	}

}
