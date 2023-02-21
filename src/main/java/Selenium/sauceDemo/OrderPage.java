package Selenium.sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {

	private WebDriver driver;
	public String order_Message;
	
	public OrderPage(WebDriver driver) {
		this.driver = base.driver;
	}
	
	private WebElement get_OrderText() {
		return driver.findElement(By.className("complete-text"));
	}
	
	public void orderMessage() {
		 order_Message = get_OrderText().getText();
		System.out.println(order_Message);
	}
	
	
	
	
	
	
	
	
}
