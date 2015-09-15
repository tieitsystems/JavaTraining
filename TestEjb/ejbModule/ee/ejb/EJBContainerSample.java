package ee.ejb;

import java.io.File;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;

public class EJBContainerSample {
	public void createStatelessBeanPool() throws EJBException, RemoteException  {
		
		File deploymentDescriptor = new File("ejb-jar.xml");
		
		
		ArrayList<SessionBean> statelessBeans   = new ArrayList<SessionBean>();
		
		
		for(int i=0; i<statelessBeans.size();i++ ) {
			
			SessionBean bean = statelessBeans.get(i);
			
			bean.ejbActivate();
		}
	}
}
