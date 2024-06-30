package controlstatements;

public class BreakLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	outer: for (int i=1;i<=3;i++) { //labelled for loop
		for (int j=1;j<=3;j++) {
			System.out.println(i+" "+j);
				if(i==2&&j==2) {
					break outer;
				
			}
		}
	}

	}

}
