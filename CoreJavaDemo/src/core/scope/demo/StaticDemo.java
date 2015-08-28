package core.scope.demo;

public class StaticDemo {

	int x;
	private static int y;
	
	
	public static void main(String[] args) {
		
		
		
		StaticDemo ins1 = new StaticDemo();
		
		StaticDemo ins2 = new StaticDemo();
		
		ins1.x = 1;
		ins2.x = 2;
		
		ins1.y = 3;
		ins2.y = 4;
		StaticDemo.y = 10;
		//.y refer to same memory.
		
		StaticDemo.test1();//static method call dont need instance
		
		//StaticDemo.test2(); cant make static reference to instance method
		
		System.out.println(ins1.y);
		ins1.test2();
		ins2.test2();

	}
	
	
	public void test2() {
		System.out.println("test1");
		
		x = 10;
		y = 10;
	}
	public static void test1() {
		System.out.println("test1");
		
		//x=10; cant access isntance members from static method
		y=10;
	}

}
