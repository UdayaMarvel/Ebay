package com.ebay;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RaviTask 
{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu");
	driver.manage().window().maximize();
	WebElement wb=driver.findElement(By.tagName("select"));
	Select s1= new Select(wb);
	List<WebElement> li  = s1.getOptions();

	for(int i=0 ; i < li.size();i++)
	{
	WebElement wb1 = li.get(i);
	String str = wb1.getText();
	System.out.println(str);
	}
}
}
