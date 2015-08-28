package core.demo1;

public class BranchingSt {

	public static void main(String[] args) {
		
		outLoop: for(int i=1; i<5; i++) {
			for(int j=1;j<5;j++) {
				if(i*j > 10)
					break outLoop;//break only inner for
				System.out.println(i+"*"+j+"="+(i*j));

			}
		}

	}

}
