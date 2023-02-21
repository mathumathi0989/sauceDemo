package Selenium.sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalInfoPage {
private WebDriver driver;

public PersonalInfoPage(WebDriver driver) {
	this.driver = base.driver;
}

private WebElement get_firstName() {
	return driver.findElement(By.id("first-name"));
}

private WebElement get_lastName() {
	return driver.findElement(By.id("last-name"));
}
private WebElement get_zipCode() {
	return driver.findElement(By.id("postal-code"));
}

private WebElement get_ContinueButton() {
	return driver.findElement(By.id("continue"));
}

public void personalInfo(String firstName, String lastName, String zipCode) {
	get_firstName().sendKeys(firstName);
	get_lastName().sendKeys(lastName);
	get_zipCode().sendKeys(zipCode);
	get_ContinueButton().click();
}



}
