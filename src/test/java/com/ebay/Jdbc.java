package com.ebay;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jdbc {

public static HttpURLConnection http;
public static void main(String[] args) throws ClassNotFoundException, SQLException, MalformedURLException, IOException {
	WebDriverManager.edgedriver().setup();
	EdgeOptions options = new EdgeOptions();
	 options.addArguments("--disable-popups");
	    options.addArguments("--disable-notifications");
	    options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("start-maximized");
	WebDriver driver = new EdgeDriver(options);
	driver.get("https://www.flipkart.com");
	
	List<WebElement> links = driver.findElements(By.tagName("link"));
	Iterator<WebElement> link = links.iterator();
	while(link.hasNext()) {
		String href = link.next().getAttribute("href");
		if(href==" "||href==null) {
			System.out.println("Link is empty"+href);
		}
		else if(!href.startsWith("https://www.flipkart.com")) {
			System.out.println("Links not related to our domain"+ href);
                        //System.out.println("Links not related to our domain"+ href);
		}
		else {
		http =	(HttpURLConnection) (new URL(href).openConnection());
		http.setRequestMethod("HEAD");
		http.connect();
		int responseCode = http.getResponseCode();
		if(responseCode==200) {
			System.out.println("Link is not a broken link" +href);
		}
		else {
			System.out.println("Link is a broken link"+href);
		}
		}
		
	}
	
	//new test
	
}

}
