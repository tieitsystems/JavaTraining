package core.scope.demo;

public class ClassZ {
	public static void main(String [] t) {
		ClassX x = new ClassX();
		
		System.out.println(x.c1);
		
		//System.out.println(x.c2); different package
		
		//System.out.println(x.c4);  protected
		//Cannot access private C3
	}
}
