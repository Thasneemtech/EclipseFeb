package classroomwork;

public class Armstrongpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1, a,b,c;
		while(i<=500) {
			a = i%10;//153%10=3
			b = i%100;//153%100=53
			b = (b-a)/10;//50/10=5
			c = i/100;//153/100=1
			if((a*a*a)+(b*b*b)+(c*c*c)==i) 
				System.out.println(i);
				i++;
		}
	}

}
