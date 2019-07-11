package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KANNAN A\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement text = driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']"));
		String t = text.getText();
		System.out.println(t);
		WebElement text1 = driver.findElement(By.xpath("//div[@class='52lr fsm fwn fcg']"));
		String t1 = text1.getText();
		System.out.println(t1);
		driver.quit();
	}
}
