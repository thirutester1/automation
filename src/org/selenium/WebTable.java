package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mthir\\Documents\\my work\\automation\\Driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> row = d.findElements(By.tagName("tr"));
		for(int i =0; i<row.size();i++) {
			List<WebElement> data = row.get(i).findElements(By.tagName("td"));
			for(int j=0; j<data.size();j++) {
				String n = data.get(0).getText();
				//System.out.println(n);
				if(n.contains("Welspun Corp")){       
					String g = data.get(2).getText();
				    System.out.println(g);
				    break;
				}else if(n.contains("Kajaria Ceramics")) {
					System.out.println(data.get(2).getText());
					break;
				}
				
			}
		}
		
	}
}
