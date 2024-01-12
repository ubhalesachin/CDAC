package testng2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest4 {
  @Test
  public void f() {
	  System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\Selenium Testing\\chromedriver-win32\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
  }
}
