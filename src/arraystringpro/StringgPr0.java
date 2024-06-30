package arraystringpro;

public class StringgPr0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Anu";
		String lastname = "Joseph";
		
		System.out.println(name+lastname);      
		System.out.println(name.concat(lastname));
		
		name.concat(lastname);
		System.out.println(name); //here only name = Anu print bcz String is immutable,it can't change
		String newname = name.concat(lastname);
		System.out.println(newname);
		
		//String Buffer and Builder
		StringBuffer name1 = new StringBuffer ("Poul");
		StringBuilder name2 = new StringBuilder ("Babu");
		name.concat(lastname);
		name1.append(name2);
		System.out.println("Name :"+name);
		System.out.println("Name1 :"+name1);
		name1.append("HOUSE");
		System.out.println(name1);
		
		
		String Name1 = "Robert";
		String Name2 = "Robert";
		String Name3 = new String ("Robert");
		String Name4 = new String ("robert");
		String Name5 = new String ("Anu");
		
		System.out.println("Name1==Name2 :"+(Name1==Name2));
		System.out.println("Name1==Name3 :"+(Name1==Name3));
		
		System.out.println("Name1 equals Name3 :"+(Name1.equals(Name3)));
		System.out.println("Name1 equals Name4 :"+(Name1.equalsIgnoreCase(Name4)));
		
		System.out.println("Length : "+(Name1.length()));
		System.out.println("CharAt : "+(Name1.charAt(4)));  //index 4
		System.out.println("Lower Case : "+(Name1.toLowerCase()));
		System.out.println("Upper Case : "+(Name1.toUpperCase()));
		System.out.println("CompareTo :"+(Name1.compareTo(Name5)));
		
		String val ="Hai";
		System.out.println("Trim :"+(val.trim()+Name1));
		
		String S = "Java is a high level programming language";
		System.out.println(S.contains("high level"));
		
		System.out.println(S.endsWith("language"));
		System.out.println(S.endsWith("level"));
		
		System.out.println(S.startsWith("Java"));
		
		
		

	}

}
