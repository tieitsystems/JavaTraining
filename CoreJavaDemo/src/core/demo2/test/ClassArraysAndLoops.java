package core.demo2.test;

public class ClassArraysAndLoops {

	public static void main(String[] args) {
		int  array[] =  {1,2,3,4,5,6,7,8,9,0};
		int x = 10;
		boolean t_or_f = (x==10);
		
		for(int i=0;i<10;i++) {
			array[i] = i+1;
		}
		
		//supportd java 1.5 later 
		for(int ele: array) {
			System.out.println(ele);
		}
		
		Calculator cal;
		Calculator [] cals = new Calculator[10];
		cals[0] = new Calculator();
		cals[1] = new Calculator();
		
		cals[0].add(1, 2);
		cals[1].add(1, 2);
		
		if(cals[3] == null ) {
			//print null
		//} else if( c1 && c2 || c3 ){
			//do somth else
		} else if (false ) {
			
		} else {
			
		}
 		
	}

}
