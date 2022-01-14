package org.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesLearn {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mthir\\Documents\\my work\\automation\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/guru99home/");
		List<WebElement> frame = d.findElements(By.tagName("iframe"));
		int size = frame.size();
		System.out.println(size);
		d.switchTo().frame("a077aa5e");
		//d.switchTo().defaultContent();
		WebElement click = d.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		click.click();
		
		String main = d.getWindowHandle();
		Set<String> child = d.getWindowHandles();
		
		for(String k : child) {
			if (!main.equals(k)) {
				d.switchTo().window(k);
			}
		}
		
		WebElement c = d.findElement(By.xpath("//a[@class='button-liveproject']"));
		c.click();
		d.switchTo().window(main);
		WebElement c1 = d.findElement(By.xpath("(//a[@class='item'])[2]"));
		c1.click();
		
		}

}
