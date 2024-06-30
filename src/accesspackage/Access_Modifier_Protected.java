package accesspackage;

//import accessmodifierpackage.Access_Modifier1;

import accessmodifierpackage.*;

public class Access_Modifier_Protected extends Access_Modifier1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Access_Modifier_Protected ob = new Access_Modifier_Protected();
		Access_Modifier2 ob1 = new Access_Modifier2();
		System.out.println("Name is :"+ob.name);
		System.out.println("Age is :"+ob.age);
		System.out.println("mail is :"+ob1.email);
	}

}
