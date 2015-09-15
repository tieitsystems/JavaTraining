package ee.ejb;

public class TestController extends WebController {

		public String getHomePage() {
			
			return "home.html";
		}
		
		public String login() {
			
			boolean isSuccess ; //= Backend LoginService call: EJB invocation
			
			if(isSuccess) {
				return "Shop.html";
			} else {
				return "invalidLogin.html";
			}
		}
}
