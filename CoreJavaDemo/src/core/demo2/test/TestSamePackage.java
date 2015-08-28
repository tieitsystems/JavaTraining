package core.demo2.test;

public class TestSamePackage {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.add(4, 5);
		int res = c.input1 + c.defaultScopeInt;
		
		//int copy = c.result;
		
		//c.privateMethod();

	}

}
