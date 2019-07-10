package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KANNAN A\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("Sony");
	WebElement click = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"));
	click.click();
	WebElement click2 = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[2]"));
	click2.click();
	WebElement click3 = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"));
	click3.click();
	driver.quit();
}
}
