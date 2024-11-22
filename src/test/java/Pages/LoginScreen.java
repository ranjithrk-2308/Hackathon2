package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ProjectSpecificationsClass;

public class LoginScreen extends ProjectSpecificationsClass{
	public void LoginScreen (WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginScreen emailsend () {
		driver.findElement(By.id("Email")).sendKeys("ranjithkumar2@gmail.com");
		return this;
	}
	public LoginScreen passwordsend() {
		driver.findElement(By.id("Password")).sendKeys("Ranjith@1234");
		return this;
	}
	public void loginclick() {
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
}
