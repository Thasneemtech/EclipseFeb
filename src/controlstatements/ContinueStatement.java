package controlstatements;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for (int i=1;i<10;i++) {
				if(i==5) {
					continue; //5 is not printed. that means here the value 5 skip
					//break;
				}
				System.out.println(i);
			}
	}

}
