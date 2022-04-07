package Definitation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.lang3.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import junit.textui.TestRunner;

public class StepByDefinition {
	WebDriver driver;
	public String URL = "https://demoapp.skillrary.com";

	
	@Given("i should open the browser and naviagte to the login page of skillrary")
	public void i_should_open_the_browser_and_naviagte_to_the_login_page_of_skillrary() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);	
		driver.findElement(By.linkText("LOGIN")).click();
		
	}
	@When("Enter Username {string}")
	public void enter_username(String string) {
		driver.findElement(By.id("email")).sendKeys(string);

	   	}
	@When("Enter Password {string}")
	public void enter_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	  
	 
	}
	@When("Click on the loginbutton")
	public void click_on_the_loginbutton() {

		driver.findElement(By.id("last")).click();
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
		if(string == "SkillRary Admin") {
			 WebElement wl = driver.findElement(By.className("hidden-xs"));
			    Assert.assertEquals(wl.getText(), string);
	driver.close();
	    }
		else
		{
			WebElement sss = driver.findElement(By.className("hidden-xs"));
		    Assert.assertEquals(sss.getText(), string);
		    System.out.println(sss);
		    driver.close();
	}
		//String username = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
		//Assert.assertEquals(username, string);
		//driver.close();	 
	}
//	@Then("i should see the admin as {string}")
//	public void i_should_see_the_admin_as(String string) {
//	  // Write code here that turns the phrase above into concrete actions
//	  String admin = driver.findElement(By.xpath("//*[@class='pull-left info']/p")).getText();
//	  Assert.assertEquals(admin, string);
//	  driver.close();
//	}
//	@Then("i should see the Registration page {string}")
//	public void i_should_naviagte_to_the_page(String string) {
//	 String Register= driver.findElement(By.xpath("//*[@class='btnRegister']")).getAttribute("value");
//	 Assert.assertEquals(Register, string);
//	 driver.close();
//	}
	}







//	@Given("i should open the browser and naviagte to the login page of skillrary")
//	public void i_should_open_the_browser_and_naviagte_to_the_login_page_of_skillrary() {
//		 // Write code here that turns the phrase above into concrete actions
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(URL);
//	}
	
//	}
	
//	@Then("i should see the username as {string}")
//	public void i_should_see_the_username_as(String string) {
//		 Assert.assertEquals(driver.getTitle(), string);
//	  
//	}	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//BELOW ONE IS FOR ORANGE HRM AND FIRST CUCUMER PROGRAM
	
//	WebDriver driver;
//	public String URL = "https://opensource-demo.orangehrmlive.com";
//	
//
//
//	@Given("i should be in login pg of OrangeHRM")
//	public void i_should_be_in_login_pg_of_orange_hrm() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(URL);
//	  
//	}
//	@When("Enter name")
//	public void enter_name() {
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//
//	}
//	@When("Enter Passwod")
//	public void enter_passwod() {
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	}
//	@When("Click LoginButton")
//	public void click_login_button() {
//		driver.findElement(By.id("btnLogin")).click();
//	}
//	
//	@Then("Login Sucessfully")
//	public void login_sucessfully() {
//		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
//	 
//	}
//}
