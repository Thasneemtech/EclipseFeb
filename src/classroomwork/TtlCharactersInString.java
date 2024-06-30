package classroomwork;

public class TtlCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "Java is a high level programming Language";
	int count = 0;
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			count++;
		}
		
	}
	System.out.println("Count of characters : "+count);

	}

}
