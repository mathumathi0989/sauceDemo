package Selenium.sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class emailPage {

	private WebDriver driver;
	public String actualMessage;
	
	public emailPage(WebDriver driver) {
		this.driver = base.driver;
	}
	
	private WebElement get_Name() {
		return driver.findElement(By.id("name"));
	}
	
	private WebElement get_Email() {
		return driver.findElement(By.id("email"));
	}
	
	private WebElement get_Phone() {
		return driver.findElement(By.id("phone"));
	}
	
	private WebElement get_Subject() {
		return driver.findElement(By.id("subject"));
	}
	
	private WebElement get_descr() {
		return driver.findElement(By.id("description"));
	}
	
	private WebElement get_submit() {
		return driver.findElement(By.id("submitContact"));
	}
	
	private WebElement get_message() {
		return driver.findElement(By.xpath("//*[text()='Thanks for getting in touch ']"));
	}
	
	public void email_Verify(String name, String email, String phoneNo, String sub, String description) throws Exception {
		get_Name().sendKeys(name);
		get_Email().sendKeys(email);
		get_Phone().sendKeys(phoneNo);
		get_Subject().sendKeys(sub);
		get_descr().sendKeys(description);
		get_submit().click();
		base b = new base();
		b.scrollTolevel();
		Thread.sleep(3000);
		actualMessage = get_message().getText();
		System.out.println(actualMessage);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
