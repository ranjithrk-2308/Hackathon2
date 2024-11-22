package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.ProjectSpecificationsClass;

public class AddSpecsToCart extends ProjectSpecificationsClass{
	public void HomeScreen (WebDriver driver) {
		this.driver=driver;
	}
	public AddSpecsToCart addRAM() {
		Actions mouse = new Actions(driver);
		WebElement RAM = driver.findElement(By.xpath("//select[@name='product_attribute_2']"));
		mouse.moveToElement(RAM).click().perform();
		driver.findElement(By.xpath("//option[@value='3']")).click();
		return this;
	}
	public AddSpecsToCart addHDD() {
		driver.findElement(By.id("product_attribute_3_6")).click();
		return this;
	}
	public void finalCart () {
		driver.findElement(By.id("add-to-cart-button-1")).click();
	}
}
