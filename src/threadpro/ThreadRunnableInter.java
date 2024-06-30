package threadpro;

public class ThreadRunnableInter implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<10;i++) {
			
			ThreadRunnableInter ob = new ThreadRunnableInter();
			Thread obj = new Thread(ob);  //if we implements Runnable interface here we given "ob" in the thread constructor then all the features of ob is get to obj. 
			obj.start();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Currently working thread is : "+Thread.currentThread().getName());
		
	}

}
