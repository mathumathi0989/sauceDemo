package Selenium.sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingPage {

private WebDriver driver;

public BillingPage(WebDriver driver) {
	this.driver = base.driver;
}
	
private WebElement get_finish() {
	return driver.findElement(By.id("finish"));
}
	
public void billing() {
	get_finish().click();
}



}
