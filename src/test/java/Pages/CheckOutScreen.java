package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Base.ProjectSpecificationsClass;

public class CheckOutScreen extends ProjectSpecificationsClass {
	public CheckOutScreen(WebDriver driver) {
		this.driver= driver;
	}
	
	public BillingAddressScreen moveToCheckout() {
		WebElement moveto = driver.findElement(By.id("checkout"));
		WebElement terms = driver.findElement(By.id("termsofservice"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(terms).click().perform();
		mouse.moveToElement(moveto).click().perform();
		return new BillingAddressScreen(driver);
	}
}
