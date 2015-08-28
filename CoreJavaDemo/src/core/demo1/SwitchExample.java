package core.demo1;


public class SwitchExample {

	public static void main(String[] args) {
		int persentage = 70;
		String rank ="";
		
		switch (persentage) {
		case 0:
			rank = "Fail";
			break;
		case 30: 
			rank = "pass";
			break;
		case 70:
			rank = "good";
			break;
		default://Optional
			System.out.println("Not valid");
			
		}
		
		
		
		
	}

}
