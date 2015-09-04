package core.io;

import java.io.IOException;


public class BasicIO {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter something:");
		
		int i = System.in.read();
		
		System.out.println("read:"+i);
	}

}
