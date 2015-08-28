package core.scope.demo;

public class ClassExtX extends ClassX{

	int d1;
	
	public static void main(String[] args) {
		ClassExtX ext = new ClassExtX();
		
		
		System.out.println(ext.c1);
		
		System.out.println(ext.c2);
		
		//System.out.println(ext.c3); private
		System.out.println(ext.c4);

	}

}

