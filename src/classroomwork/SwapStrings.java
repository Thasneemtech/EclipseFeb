package classroomwork;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Hello";
		String s2 = "Dubai";
		String S = s1 + s2;
		
		System.out.println("Befoe Swap : "+s1 +" "+s2);

		s2 = S.substring(0, S.length()-s2.length());
		s1 = S.substring(s2.length());
		System.out.println("After Swap : "+s1 +" "+s2);
	}

}
