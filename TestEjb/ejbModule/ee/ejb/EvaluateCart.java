package ee.ejb;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

//This need to be defined as stateless in deployment descriptor
public class EvaluateCart implements SessionBean {
	
	public int evaluate() throws RemoteException {
		
		// Logic to calculate total value of items in cart
	        return 0;
	    }
	
	
	public void checkout(Cart cart) {
		

	}
	
	

		//outdated - not supported in JEE 7
		public void ejbCreate() throws EJBException, RemoteException {
	    }

	    @Override
	    public void ejbRemove() throws EJBException, RemoteException {
	    }
	    
	    @Override
	    public void ejbActivate() throws EJBException, RemoteException {
	    }

	    @Override
	    public void ejbPassivate() throws EJBException, RemoteException {
	    }

		@Override
		public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {
			// TODO Auto-generated method stub
			
		}
}