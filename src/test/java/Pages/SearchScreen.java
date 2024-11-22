package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.ProjectSpecificationsClass;

public class SearchScreen extends ProjectSpecificationsClass {
	public void SearchScreen (WebDriver driver) {
		this.driver = driver;
	}
	
	public AddSpecsToCart addtocart() {
		Actions mouse = new Actions(driver);
		
		WebElement cart =driver.findElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));
		mouse.moveToElement(cart).click().perform();
		return new AddSpecsToCart();
	}

}
