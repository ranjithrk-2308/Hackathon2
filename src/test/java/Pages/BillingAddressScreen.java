package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ProjectSpecificationsClass;

public class BillingAddressScreen extends ProjectSpecificationsClass {
	public BillingAddressScreen(WebDriver driver) {
		this.driver=driver;
	}
	public BillingAddressScreen details () {
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Sivakasi");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("2/2153 S Devi nagaer, Sithurajapuram");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("626189");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9655327248");
		driver.findElement(By.xpath("(//button[@name='save'])[1]")).click();
		return this;
	}
}
