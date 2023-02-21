package Selenium.sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = base.driver;
	}
	
	private WebElement get_userName() {
		return driver.findElement(By.id("user-name"));
	}
	
	private WebElement get_password() {
		return driver.findElement(By.id("password"));
	}
	
	private WebElement get_loginButton() {
		return driver.findElement(By.id("login-button"));
	}
	
	public void login(String userName, String password) {
		get_userName().sendKeys(userName);
		get_password().sendKeys(password);
		get_loginButton().submit();
	}
	
	
	
}
