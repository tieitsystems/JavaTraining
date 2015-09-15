package ee.ejb;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

//Statefull EJB.. to be configured in deployment descriptor
public class TestBackendService implements SessionBean  {
			
	int state = 0;
	
	
	
	public boolean login(String userNm, String pwd) {
		//check in database if user is valid
		if(isSuccess) {
			state = 1;
			return true;
		} else {
			
			state = -1;
			return false;
		}
	}
	
	public boolean checkout( ) {
		
		if(state == 0) {
			return  "do you want to checkout as annonymos user or Login?";
		} else if(state == -1 ) {
			return "cant checkout .. login failed/reset pwd";
		} else {
			return true;
		}
		
		
	}
	
	
	
	

	@Override
	public void setSessionContext(SessionContext sessionContext)
        throws EJBException, RemoteException {
    }

	//	@Override not supported in JEE 7
	public void ejbCreate() throws EJBException, RemoteException {
    	//what you want to do when EJB is created
    }

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
    }

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

}
