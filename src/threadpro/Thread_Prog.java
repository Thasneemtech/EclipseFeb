package threadpro;

public class Thread_Prog {

	public static void main(String[] args)  { //instead of try/catch we can also use throws interrupted exception
		// TODO Auto-generated method stub
		
		Thread t = Thread.currentThread();
		System.out.println("Current thread is : "+t);
		//System.out.println(Thread.currentThread().getName());//for getting current thread name
		
		//change the name of the thread
		t.setName("New Thread");
		System.out.println("New Thread Name is : "+t);
		
		try {
		for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}

}
