package ee.ejb7;

import javax.ejb.Remote;

@Remote
public interface EjbClientForStatefulEjb {
	public int evaluate();
}
