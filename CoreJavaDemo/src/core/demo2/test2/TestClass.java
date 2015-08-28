package core.demo2.test2;

import core.demo2.test.Calculator;

public class TestClass {
	public void test() {
		Calculator c = new Calculator();
		
		c.add(4, 5);
		
		//Default can not be called from class outside the package
		//int res = c.input1 + c.defaultScopeInt;
		
		//private call is not allowd out side class
//		int copy = c.result;
		
//		c.privateMethod();
	}
}
