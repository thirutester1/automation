package org.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mthir\\Documents\\my work\\automation\\Driver\\chromedriver.exe");
	    	WebDriver d = new ChromeDriver();
	    	d.manage().window().maximize();
	    	d.get("https://www.flipkart.com/");
	    	//d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    	//WebDriverWait w = new WebDriverWait(d,10);
	       //WebElement close = d.findElement(By.xpath("//button[text()='✕']"));
	       // w.until(ExpectedConditions.elementToBeClickable(close));
	       Wait fwait = new FluentWait(d).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	       WebElement close = d.findElement(By.xpath("//button[text()='✕']"));
	       fwait.until(ExpectedConditions.elementToBeClickable(close));
	    	
	        close.click();
	    	d.findElement(By.xpath("//input[@type='text']")).sendKeys("realme");
	    	d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	      //  Thread.sleep(2000);
	    	/*d.findElement(By.xpath("//div[text()='realme C21Y (Cross Blue, 32 GB)']")).click();
	    	// Thread.sleep(2000);
		    	String main = d.getWindowHandle();
		    	Set<String> child = d.getWindowHandles();
		    	List<String> many = new ArrayList<String>(child);
		    	d.switchTo().window(many.get(1));
		    	
	    	d.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
	 	   
	    	d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    	
	    	Thread.sleep(3000);
	    	
	    	d.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	    	Thread.sleep(3000);
	    	d.switchTo().window(many.get(1));*/
	    	
	    }
}
