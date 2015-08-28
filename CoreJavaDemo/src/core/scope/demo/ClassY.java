package core.scope.demo;

public class ClassY {
	public static void main(String [] t) {
		ClassX x = new ClassX();
		
		System.out.println(x.c1);
		
		System.out.println(x.c2);
		
		System.out.println(x.c4); //Cannot access private C3
	}
}
