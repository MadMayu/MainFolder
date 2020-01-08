package MavenGID.MavenAID_OrangeHRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AdminClass {
	public WebDriver bo;
	public Actions act;
	public String bpath = "http://apps.qaplanet.in/qahrm/login.php";
  @Test()
  public void CompanyInfo_General() throws InterruptedException {
	  act.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
	  Thread.sleep(1500);
	  act.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Company Info')]"))).perform();
	  Thread.sleep(1500);
	  act.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'General')]"))).perform();
	  Thread.sleep(1500);
	  Assert.assertEquals(bo.findElement(By.xpath("//h2[contains(text(),'Company Info : General')]")).getText(), "Company Info : General");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium\\drivers\\chromedriver.exe");
	  bo =new ChromeDriver();
	  act = new Actions(bo);
	  bo.get(bpath);
	  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  bo.findElement(By.xpath("//input[@name='Submit']")).click();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1500);
	  bo.close();
  }

}
