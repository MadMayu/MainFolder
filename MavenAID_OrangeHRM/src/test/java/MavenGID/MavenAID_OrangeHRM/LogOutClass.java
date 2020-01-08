package MavenGID.MavenAID_OrangeHRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LogOutClass {
	public WebDriver bo;
	public String bpath = "http://apps.qaplanet.in/qahrm/login.php";
  @Test(enabled =true,priority =1, groups ="logout")
  public void TC2_1() throws InterruptedException {
	  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  bo.findElement(By.xpath("//input[@name='Submit']")).click();
	  Thread.sleep(1500);
	  bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	  
	  Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	  Thread.sleep(1500);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium\\drivers\\chromedriver.exe");
	  bo =new ChromeDriver();
	  bo.get(bpath);
  }

  @AfterMethod
  public void afterMethod() {
	  bo.close();
  }

}
