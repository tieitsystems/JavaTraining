package core.demo1.string;

public class StringDemo {

	public static void demo() {
		
		int i = 232;
		char c = 'l';
		
		String var1 = null; //same as var1 = null;
		String var2 = "VAR 2"; //String literal
		String var3 = new String();
		String var4 = new String("Var 4"); //Constructor argument
		

		System.out.println(var3);
		
		var1= var3+var2;
		
		var4.substring(2);
		
		if( var4.equals(var1)) {
			System.out.println("Var 1 & 4 are equal");
		}
		
	}
	
	
	public static void main(String[] arg) {
		demo();
	}
}

class test {
	
}



