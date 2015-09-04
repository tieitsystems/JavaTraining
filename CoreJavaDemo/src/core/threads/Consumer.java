package core.threads;

public class Consumer extends Thread {
	Queue q;
	
	public Consumer(Queue input) {
		q = input;
	}
	
	public void run() {
		if(q.size() <1) {
			try {
				this.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			consume();
		}
	}
	
	
	public synchronized void consume() {
		System.out.println("Read from Q: "+q.get());
	}
}
