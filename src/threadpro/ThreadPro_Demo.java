package threadpro;

public class ThreadPro_Demo extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("New Thread");
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPro_Demo t = new ThreadPro_Demo()	;
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		}
		
	}

}
