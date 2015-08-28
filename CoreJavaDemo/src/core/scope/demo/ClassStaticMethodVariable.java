package core.scope.demo;

public class ClassStaticMethodVariable {

	int inst;
	static int count;
	
	static {
		count =0;
		//inst =0; static block
	}
	
	ClassStaticMethodVariable() {
		count ++;
	}
	
	public static void main(String[] args) {
		
		ClassStaticMethodVariable cust1 = new ClassStaticMethodVariable();
		ClassStaticMethodVariable cust2 = new ClassStaticMethodVariable();
		ClassStaticMethodVariable cust3 = new ClassStaticMethodVariable();
		ClassStaticMethodVariable cust4 = new ClassStaticMethodVariable();
		
	}
	
	
	public void coustomerCount() {
		int x;
		count++;
	}

}
