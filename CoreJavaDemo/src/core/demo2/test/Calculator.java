package core.demo2.test;

public class Calculator {
	
	private int result;
	public int input1, input2;
	
	int defaultScopeInt;
	
	public static void main(String[] args) {
		
		Calculator var1;
		var1 = new Calculator();
		
		int ret = var1.add(12, 13);
		var1.privateMethod();
		
		System.out.println("Result:"+ret);
	}
	
	public int add(int s1, int s2) {
		int result = s1 + s2;
		return result;
	}
	
	private void privateMethod() {
		System.out.println("This is private method");
	}

}
