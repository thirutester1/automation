package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Thiru\\EclipseWorkSpace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.automationtesting.in/Alerts.html");
		WebElement e = d.findElement(By.xpath("//a[contains(@href,'Textbox')]"));
		e.click();
		WebElement e1 = d.findElement(By.xpath("//button[contains(@class,'btn btn-info')]"));
		e1.click();
		Thread.sleep(2000);
		Alert a= d.switchTo().alert();
		String s = a.getText();
		System.out.println(s);
		a.sendKeys("yugi");
		a.accept();
		
		
}
}