package testng;




import org.testng.annotations.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.decorators.WebDriverDecorator;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeTest;



public class NewTest2{

  public static WebDriver dr;

  @Test(priority = 1)

  public void register() {

	  

	  dr.findElement(By.xpath("//input[@id='input-username']")).sendKeys("ubhalesachin");

	 

	  dr.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Sachin");

	  dr.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Ubhale");

	  

	  dr.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ubhalesachin@gmail.com");

	  

	 Select country=new Select(dr.findElement(By.xpath("//select[@id='input-country']")));

	 country.selectByVisibleText("India");

	 

	 dr.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Sachin@1234");

	 

	 dr.findElement(By.xpath("//body/div[@id='account-register']/div[@id='register']/div[1]/div[1]/form[1]/div[7]/button[2]")).click();

	 

	

	  

  }

  

  @Test(priority = 2)

  public void login() {

	  

	 WebElement email=dr.findElement(By.xpath("//input[@id='input-email']"));

	 email.sendKeys("ubhalesachin@gmail.com");

	 String printemail=email.getAttribute("value");

	 System.out.println(printemail);

	 

	 WebElement pwd=dr.findElement(By.xpath("//input[@id='input-password']"));

	 pwd.sendKeys("Sachin@1234");

	 String printpwd=pwd.getAttribute("value");

	 System.out.println(printpwd);

	 

	 

	 dr.findElement(By.xpath("//body/div[@id='account-login']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/button[2]")).click();

	  

  }

  

  @BeforeTest

  public void beforeTest() {

	  

	  System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

	  dr=new ChromeDriver();

	  

	  dr.get("https://www.opencart.com/index.php?route=account/register");

	  dr.manage().window().maximize();

	  

	  System.out.println(dr.getCurrentUrl());

	  

	  

  }



}

