package core.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class TestArrayList  {//extends Object   dont have to explicitly extend Object

	public static void main(String[] args) {
		ArrayList<Integer>  list = new ArrayList<Integer> ();
		
		
		list.add(10);
		//list.add("this is a string"); cant add string, only ints are allowed
		list.add(100);
		
	
		System.out.println("Array has "+list.size()+" elements");
		
		
		
		//Default defination: HashMap<Object, Object> map = new HashMap<Object, Object>();
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "value1");
		map.put(12, "value2");
		map.put(4, "value3");
		map.put(5, "value4");
		
		System.out.println("value for key2: "+map.get(4));
		
	}

}
