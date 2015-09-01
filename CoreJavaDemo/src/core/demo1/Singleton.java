package core.demo1;

public class Singleton  {

	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		
		return instance;
	}
	
	public boolean isUserActive() {
		return true;
	}

}


class test1 {
	public static void test() {
		Singleton ins = Singleton.getInstance();
		Singleton ins2 = Singleton.getInstance();
	}
}
