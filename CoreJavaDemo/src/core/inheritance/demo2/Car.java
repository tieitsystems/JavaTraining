package core.inheritance.demo2;

public class Car extends Vehicle implements IAuto, IRobo{

	int speed;
	int gear;
	
	static String type = "car";
	
	public Car() {
		super();

		System.out.println("Car constructor!");
		speed = 0;
		gear = 0;
		
	}

	@Override
	public void autoMove() {
		
	}

	@Override
	public void start() {
		
	}
	
	@Override
	public void test() {
		System.out.println("this is car test!");
	}

	@Override
	public void run(int speed) {
		this.start();
		
		this.test(); //same as test();
		
		this.speed = speed;
		this.gear = 1;
		
		this.type = "";
		
		this.overload();
		this.overload(10);
		this.overload(10,10);
	}
	
	
	public void overload() {
		
	}
	public void overload(int x) {
		
	}
	public int overload(int x, int y) {
		
		return 0;
	}


}
