package com.selenium.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");  
	     WebDriver driver=new ChromeDriver();  
		 driver.navigate().to("http://www.google.com/");  
		 //driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
		 //driver.findElement(By.name("btnK")).click();  

	}

}
