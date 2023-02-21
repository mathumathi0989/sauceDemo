package Selenium.sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

private WebDriver driver;

public CheckoutPage(WebDriver driver) {
	this.driver = base.driver;
}
	
private WebElement get_checkout() {
	return driver.findElement(By.id("checkout"));
}
	
private WebElement get_Quantity() {
	return driver.findElement(By.xpath("//div[@class='cart_quantity']"));
}
public void checkout() {
	String num = get_Quantity().getText();
	int no = Integer.parseInt(num);
	System.out.println("Number of items in checkout page is "+no);
	get_checkout().click();
}
	
}
