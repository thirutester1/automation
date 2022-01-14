package org.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mthir\\Documents\\my work\\automation\\Driver\\chromedriver.exe");
	    	WebDriver d = new ChromeDriver();
	    	d.manage().window().maximize();
	    	d.get("https://www.flipkart.com/");
	    	Thread.sleep(2000);
	    	d.findElement(By.xpath("//button[text()='✕']")).click();
	    	d.findElement(By.xpath("//input[@type='text']")).sendKeys("realme");
	    	d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	        Thread.sleep(2000);
	    	d.findElement(By.xpath("//div[text()='realme C21Y (Cross Blue, 32 GB)']")).click();
	    	 Thread.sleep(2000);
		    	String main = d.getWindowHandle();
		    	Set<String> child = d.getWindowHandles();
		    	List<String> many = new ArrayList<String>(child);
		    	
		    	d.switchTo().window(many.get(1));
		    	
	    	d.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
	 	   
	    	d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    	
	    	Thread.sleep(3000);
	    	
	    	d.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	    	d.switchTo().window(many.get(0));
	    	
	    }
}
