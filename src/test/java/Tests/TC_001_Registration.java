package Tests;
import org.testng.annotations.Test;
import Base.ProjectSpecificationsClass;
import Pages.HomeScreen;

public class TC_001_Registration extends ProjectSpecificationsClass{
@Test
	public  void registrationTest() {
		// TODO Auto-generated method stub
		HomeScreen obj = new HomeScreen();
		obj.browserlaunch();
		obj.RegisterClick().
		gender().
		firstname().
		lastname().
		dobDay().
		dobMonth().
		dobYear().
		email().
		companyName().
		password().
		confirmPassword().
		registerButton();

	}
}
