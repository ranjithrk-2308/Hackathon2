package Base;

import org.openqa.selenium.WebElement;

import Utils.UtilityClass;

public class ProjectSpecificationsClass extends UtilityClass{
	public  void launchbrowser () {
		// Opening Browser:
				browserlaunch();
			}
			
			public void browserclose() {
		// Closing Browser
				closebrowser();
			}
			public void waitmethod () {
				visibilityOfElement(null);
			}

}
