package MavenGID.MavenAID_OrangeHRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginClass {
	public WebDriver bo;
	public String bpath = "http://apps.qaplanet.in/qahrm/login.php";
	
  @Test(enabled=true,priority = 1,groups="login")
  public void TC1_1() {
	  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  bo.findElement(By.xpath("//input[@name='Submit']")).click();
	  Assert.assertEquals(bo.getTitle(), "OrangeHRM");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium\\drivers\\geckodriver.exe");
	  bo =new FirefoxDriver();
	  bo.get(bpath);
  }

  @AfterMethod
  public void afterMethod() {
	  bo.close();
  }

}
