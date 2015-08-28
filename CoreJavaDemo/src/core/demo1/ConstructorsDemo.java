package core.demo1;

public class ConstructorsDemo {
	public String name;
	int age;
	
	//Default const
	private ConstructorsDemo() {
		name = "Mr X";
		age = 30;
		System.out.println("Constructor called!");
	}
	
	//Overloading
	public ConstructorsDemo(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Constructor2 called!");
	}
	

	public static void main(String[] args) {
		ConstructorsDemo test = new ConstructorsDemo("X",30);
		ConstructorsDemo test2 = new ConstructorsDemo("Y", 40);

		System.out.println(test.name);
		
		System.out.println("end");
		
	}
}

class test {
	int x;
	
	public static int testMethod() {
		ConstructorsDemo newInst = new ConstructorsDemo("Y", 40);
		//Can not call the private constructor
		//ConstructorsDemo newInst2 = new ConstructorsDemo();
		
		return 0;
	}
	
	public void te() {
		this.x = 10;
	}
}