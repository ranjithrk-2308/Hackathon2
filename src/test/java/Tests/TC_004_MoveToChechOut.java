package Tests;

import Base.ProjectSpecificationsClass;
import Pages.HomeScreen;

public class TC_004_MoveToChechOut extends ProjectSpecificationsClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeScreen movetocheckout = new HomeScreen();
		movetocheckout.browserlaunch();
		movetocheckout.LoginClick().
		emailsend().
		passwordsend().
		loginclick();
		movetocheckout.ShoppingCart().
		moveToCheckout().
		details();
	}
}
