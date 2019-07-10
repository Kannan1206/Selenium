package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNAN A\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement txtuserName = driver.findElement(By.id("email"));
		txtuserName.sendKeys("JAVA");
		WebElement txtuserPass = driver.findElement(By.id("pass"));
		txtuserPass.sendKeys("HELLO");
		WebElement btnlogin = driver.findElement(By.xpath("//input[@value='2']"));
		btnlogin.click();
		driver.quit();
	}

}
