package com.ebay;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TodaysDeals {
public static WebDriver driver;
@Given("user launches the browser {string}")
public void user_launches_the_browser(String url) {
	WebDriverManager.edgedriver().setup();
	EdgeOptions options = new EdgeOptions();
	 options.addArguments("--disable-popups");
	    options.addArguments("--disable-notifications");
	    options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("start-maximized");
	driver = new EdgeDriver(options);
	driver.get(url);
}
	
@When("user clicks on create new accout")
public void user_clicks_on_create_new_accout() throws InterruptedException {
	Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
}

@When("user enters the first name {string}")
public void user_enters_the_first_name(String fname) throws InterruptedException {
	Thread.sleep(2000);
    WebElement firstname = driver.findElement(By.name("firstname"));
    firstname.sendKeys(fname);
}

@When("user enters the last name {string}")
public void user_enters_the_last_name(String lname) throws InterruptedException, IOException {
	Thread.sleep(2000);
  WebElement lastname = driver.findElement(By.name("lastname"));
  lastname.sendKeys(lname);
  File f = new File ("C:\\Users\\ADMIN\\eclipse-workspace\\Ebay\\src\\test\\resources\\Creds.property");
  FileInputStream f1 = new FileInputStream(f);
  Properties p = new Properties();
  p.load(f1);
  String user = p.getProperty("username");
  System.out.println(user);
  
  p.setProperty("value", "qwerty");
 FileOutputStream f2 = new FileOutputStream(f);
 p.save(f2, "updated new Value");
  
}

@When("user enters the mobile number {string}")
public void user_enters_the_mobile_number(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enters the password {string}")
public void user_enters_the_password(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user chooses the dob")
public void user_chooses_the_dob() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user select gender")
public void user_select_gender() {
   driver.close();
}

@When("user clicks on create account")
public void user_clicks_on_create_account() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


	
}
