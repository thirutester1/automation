package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Thiru\\EclipseWorkSpace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.w3schools.com/html/html_iframe.asp");
		d.switchTo().frame(0);	
		WebElement e = d.findElement(By.xpath("//a[contains(@class,'w3-bar-item w3-button')]"));
}
}