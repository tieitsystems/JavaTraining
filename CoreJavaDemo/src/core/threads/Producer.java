package core.threads;

import java.util.ArrayList;

public class Producer implements Runnable {

	Queue q;

	public Producer(Queue input) {
		q = input;
	}
	
	@Override
	public void run() {
		System.out.println("produce a number!");
		produce(1);
	}
	
	
	public synchronized void produce(int v) {
		q.put(v);
	}

}