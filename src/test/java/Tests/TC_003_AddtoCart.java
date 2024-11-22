package Tests;

import Base.ProjectSpecificationsClass;
import Pages.HomeScreen;

public class TC_003_AddtoCart extends ProjectSpecificationsClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeScreen addtoCart = new HomeScreen();
		addtoCart.browserlaunch();
		addtoCart.LoginClick().emailsend().passwordsend().loginclick();
		addtoCart.searchbuttonclick().
		addtocart().
		addRAM().
		addHDD().
		finalCart();
	}
}
