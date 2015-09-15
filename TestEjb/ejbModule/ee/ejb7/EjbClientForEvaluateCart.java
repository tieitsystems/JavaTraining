package ee.ejb7;

import javax.ejb.Remote;

@Remote
public interface EjbClientForEvaluateCart {
	public int evaluate();
}
