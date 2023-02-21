package Selenium.sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AddToCartPage {
private WebDriver driver;

public AddToCartPage(WebDriver driver) {
	this.driver = base.driver;
}


private WebElement get_add_to_cart() {
	return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
}
private WebElement get_cart_Link() {
	return driver.findElement(By.className("shopping_cart_link"));
}

private WebElement get_cart_NumberOfItems() {
	return driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
}
public void addToCart() {
	get_add_to_cart().click();
	System.out.println("Number of items in shopping cart " +numberOfItemsCart()); 
	get_cart_Link().click();
}

public int numberOfItemsCart() {
	String num = get_cart_NumberOfItems().getText();
	int no = Integer.parseInt(num);
	return no;
}



}
