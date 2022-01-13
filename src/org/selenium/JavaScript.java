package org.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Thiru\\EclipseWorkSpace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/guru99home/");
		WebElement e = d.findElement(By.xpath("(//div[contains(@class,'rt-block')])[35]"));
		WebElement e1 = d.findElement(By.xpath("//a[contains(@href,'http://www.guru99.com/software-testing.html')]"));
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("arguments[0].scrollIntoView(false)",e);
		TakesScreenshot t1 = (TakesScreenshot)d;
		File src1 = t1.getScreenshotAs(OutputType.FILE);
		File des1 = new File(".//Screenshot//down.png");
		FileUtils.copyFile(src1, des1);
		j.executeScript("arguments[0].scrollIntoView(true)",e1);
		
		TakesScreenshot t = (TakesScreenshot)d;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File(".//Screenshot//up.jpg");
		FileUtils.copyFile(src, des);
		
}
}