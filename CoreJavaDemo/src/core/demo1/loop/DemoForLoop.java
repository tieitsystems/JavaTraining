package core.demo1.loop;





public class DemoForLoop {
	
	
	//Encapsulation -- Go through all OOP concepts of Java
	private String name;
	private String ssn;
	private static int index;


	
	
	
	//any class can call
	public static void loop() {
		
		System.out.println("Loop start");
		
		int i=0;
		
		
		//init; condition; increment
		for(index=0;index<10; index++) {
			System.out.println(index);
		}
		System.out.println("Loop END");

		
		//Can not call non-static method here 
		//defaultFunc();
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String tempname) {
		 name = tempname;
	}
	
	//Masking SSN - secure private data
	public String getSSN() {
		return "xxx.xx"+ssn.substring(5);
	}

	//Private - Only to the class
	private  void privateFunc() {
		System.out.println("This is privateFunc");
		
		defaultFunc();
	}
	
	//Package level - Default access
	 void defaultFunc() {
		System.out.println("This is defaultFunc");
	}
}
