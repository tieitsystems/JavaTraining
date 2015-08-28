package core.demo1.loop;


public class RunDemo {
	
	
	public static void main(String[] args) {
		System.out.println("Demo start");

		//new instance
		DemoForLoop var1 = new DemoForLoop();
		
		//instance method
		var1.setName("Naveen");
		
		//New instance
		DemoForLoop var2 = new DemoForLoop();
		
		//different instance method
		var2.setName("Srini");
		
		
		
		//Static method.. only one on template not duplicated on var1,var2
		DemoForLoop.loop();
		var1.loop();
		var2.loop();
		
		System.out.println("var1 name: "  + var1.getName());
		System.out.println("var2 name: "  + var2.getName());
		
		System.out.println("Demo End");
	}
	
	
}
