package core.threads;

import java.util.ArrayList;

public class Queue {

	ArrayList<Integer> Arr = new ArrayList<Integer>();

	public void put(int v) {
		Arr.add(v);
	}

	public int get() {

		return  Arr.get(0);
	}
	
	public int size() {
		return Arr.size();
	}

}