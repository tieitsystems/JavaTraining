package core.inheritance.demo2;

public class Vehicle {

	protected int cost;
	
	public Vehicle() {
		System.out.println("Vehicle constructor!");
		this.cost = 0;
	}
	
	public void test() {
		System.out.println("Vehicle test!");
	}
}
