package core.exceptions;
public class TestUserAuth {

	public static void main(String[] args) {
		
		try {
		
			int i=0;
			//int x = 10/i;
			
		boolean isValid = AutheticationService.authenticate("abcd", "pwd");
		
		System.out.println("abcd is valid?"+isValid);
		
		 isValid = AutheticationService.authenticate("abc", null);

		System.out.println("abc is valid?"+isValid);

		} catch(MyOwnException ex) {
			System.out.println("Null Value passed:"+ex.getMessage());
		} 
	}

}
