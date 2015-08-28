package core.exceptions;


public class AutheticationService {

	public static boolean authenticate(String userName, String pwd) throws MyOwnException {
		
		if(userName == null)
			throw new MyOwnException("USER Name is null");
		
		if(pwd == null)
			throw new MyOwnException("Pwd is null");
		
		if("abc".equals(userName) && pwd.equals("pwd"))
			return true;
			else 
				return false;
			
	}
}
