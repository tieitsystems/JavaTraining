package core.inheritance.demo;

public class HRConsultant implements EmployeeInterface {
	int hrInformationAccesslevel;

	@Override
	public String getType() {
		return "HRc";
	}
	
}
