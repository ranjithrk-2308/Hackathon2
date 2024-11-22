package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecificationsClass;

public class HomeScreen extends ProjectSpecificationsClass {
	public void HomeScreen (WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, this);	
	}
	public RegistrationPage RegisterClick () {
		driver.findElement(By.linkText("Register")).click();
		return new RegistrationPage() ;
	}
	
	public LoginScreen LoginClick() {
		driver.findElement(By.linkText("Log in")).click();
		return new LoginScreen();
	}
	public SearchScreen searchbuttonclick () {
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new SearchScreen();
	}
	
		public CheckOutScreen ShoppingCart () {
			driver.findElement(By.xpath("//span[@class='cart-label']")).click();
			return new CheckOutScreen(driver);
		}
}
