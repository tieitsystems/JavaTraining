package core.inheritance.demo;

public class TestDemo {

	public static void main(String[] args) {
		Manager mng1 = new Manager();
		Manager mng2 = new Manager();
		
		//mng1.name = "Mr X";
		//mng2.name = "Mr Y";

		HRManager hrManager = new HRManager();
		
		 EmployeeInterface dev1 = new Developer();
		
		Developer dev2 = new Developer();
		
		//dev1.age = 40;
		//dev2.age = 30;
		
		//dev1.skillSet = "C";  compiler wont let you use derived variables using sub class reference
		dev2.skillSet = "java";
		
		((Developer) dev1).skillSet = "C";
		
		 EmployeeInterface[] allEmployees = new EmployeeInterface[6];
		
		allEmployees[0] = new Developer();
		allEmployees[1] = new Developer();
		allEmployees[2] = new Developer();
		allEmployees[3] = new Developer();
		allEmployees[4] = new HRManager();
		allEmployees[5] = new Manager();

		for(EmployeeInterface emp: allEmployees) {
		System.out.println(emp.getType());
		}		
		
		
	
	}
	
	
	public static void testInterface() {
		//EmployeeInterface emp1 = new EmployeeInterface();
	}

	
}
