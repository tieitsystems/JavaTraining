package core.threads;

public class ThreadManager {
	public static void main(String [] ar) throws InterruptedException {
		
		Queue q = new Queue();
				
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		Thread x = new Thread(p);
		
		x.start();
		
		c.start();
	}
}
