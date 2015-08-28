package core.exceptions;

import java.io.IOException;

public class TryDemo {

	public static void main(String[] args) {
		
		System.out.println("Start Main!");
		
		System.out.println("Create user session!");
		
		try {
			
			int i2 = 10;
			int test2 = 10/i2;
			
			//Update session with user key
			
			System.out.println("User login successful!");
		
			System.out.println("Checkout and logout!");
			
		} catch(ArithmeticException ex) {
			
			System.out.println("Art exp: Invalid user/pwd");
			
		} catch(Exception ex) {
			
			System.out.println("Invalid user/pwd");
			
		} finally {
			System.out.println("Close session!");
		}
		

	}

}
