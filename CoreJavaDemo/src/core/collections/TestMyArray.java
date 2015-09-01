package core.collections;

import java.util.HashMap;

import core.inheritance.demo.EmployeeInterface;
import core.inheritance.demo.HRManager;
import core.inheritance.demo.Manager;

public class TestMyArray {

	public static void main(String[] args) {
		MyArray genericArray = new MyArray<Object>(10);
		MyArray intArray = new MyArray<Integer>(10);
		MyArray stringArray = new MyArray<String>(10);
		
		MyArray<EmployeeInterface> employeeArray = new MyArray<EmployeeInterface>(10);

		employeeArray.add(new HRManager());
		employeeArray.add(new Manager());
		
		//Iterator - old style
		EmployeeInterface[] array = new EmployeeInterface[10];
		employeeArray.toArray(array) ;
		for(EmployeeInterface emp: array) {
			System.out.println(emp.getType());
		}
		
		
		HashMap map = new HashMap();
		
		
		for(Object key: map.keySet()) {
			map.get(key);
		}
	}

}
