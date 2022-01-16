package org.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mthir\\Documents\\my work\\automation\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 /*	d.get("https://www.facebook.com/");
	
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement day = d.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("15");
		WebElement m = d.findElement(By.id("month"));
		Select s1= new Select(m);
		s1.selectByVisibleText("Mar");
	     System.out.println(m.getText());
	    WebElement y=	d.findElement(By.id("year"));
		Select s2=new Select(y);
        s2.selectByValue("1994"); */
		
        d.get("https://demoqa.com/select-menu");
    	
	
		WebElement day = d.findElement(By.id("cars"));
		Select s = new Select(day);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
	  //  System.out.println(s.getAllSelectedOptions());	
	    List<WebElement> li = s.getAllSelectedOptions();
	    for(int i=0; i<li.size(); i++) {
	    	WebElement name = li.get(i);
	    	String t = name.getText();
	    	System.out.println(t);
	    }
}
}