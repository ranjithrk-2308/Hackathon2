package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Base.ProjectSpecificationsClass;

public class RegistrationPage extends ProjectSpecificationsClass {
	
	
	public  void RegistrtionPage(WebDriver driver) {
		this.driver = driver;
	}public RegistrationPage gender () {
		driver.findElement(By.id("gender-male")).click();
		return this;
	}
	
	public RegistrationPage firstname () {
		driver.findElement(By.id("FirstName")).sendKeys("Ranjith");
		return this;
	}
	public RegistrationPage lastname () {
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		return this;
	}
	public RegistrationPage dobDay () {
		driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).click();
		driver.findElement(By.xpath("//option[@value='23']")).click();
		return this;
	} 
	public RegistrationPage dobMonth () {
		driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).click();
		driver.findElement(By.xpath("//option[text()='August']")).click();
		return this;
	}
	public RegistrationPage dobYear () {
		driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).click();
		driver.findElement(By.xpath("//option[@value='1999']")).click();
		return this;
	}
	public RegistrationPage email() {
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("ranjithkumar2@gmail.com");
		return this;
	}
	public RegistrationPage companyName () {
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("HCLTech");
		return this;
	}
	public RegistrationPage password() {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Ranjith@1234");
		return this;
	}
	public RegistrationPage confirmPassword () {
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Ranjith@1234");
		return this;
	}
	public void registerButton () {
		driver.findElement(By.id("register-button")).click();
	}
}
