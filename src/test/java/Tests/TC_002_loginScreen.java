package Tests;

import org.testng.annotations.Test;
import Base.ProjectSpecificationsClass;
import Pages.HomeScreen;

public class TC_002_loginScreen extends ProjectSpecificationsClass{
@Test
	public  void LoginTest() {
		// TODO Auto-generated method stub
		HomeScreen login = new HomeScreen();
		login.launchbrowser();
		login.LoginClick().
		emailsend().
		passwordsend().
		loginclick();
	}
}
