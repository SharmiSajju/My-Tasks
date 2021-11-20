package org.program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\D3\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txt1 = driver.findElement(By.id("twotabsearchtextbox"));
		txt1.sendKeys("iphone");
		WebElement btnsearch = driver.findElement(By.id("nav-search-submit-button"));
		btnsearch.click();
	}

}
