package com.login.com;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class NewTest {
	WebDriver driver;
	@BeforeClass
	public void testSetup()
	{
	System.setProperty("webdriver.EdgeDriver.driver", "C://Users//Jyotheeswar//Downloads//newver//msedgedriver.exe\"");
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	}
    @BeforeMethod
    public void launchBrowser() {
    	driver.get("http://iblesoft.smarteweb.com/wbe/index.php/en/?option=com_register&view=login");
    	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
    }
  @Test
  public void f() {
	  driver.findElement(By.name("unameTxt")).sendKeys("IBLEC1044");
	  driver.findElement(By.name("passwordTxt")).sendKeys("Iblesoft@123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement( By.xpath ("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/a")).click();
		driver.findElement(By.id("mnameTxt")).sendKeys("TATA");
		driver.findElement(By.id("carrierTxt")).sendKeys("DTDC");
		driver.findElement(By.id("carriertrackingTxt")).sendKeys("100202");
		driver.findElement( By.xpath("//*[@id=\"orderdateTxt\"]")).click();
	    driver.findElement( By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).click();                      
		driver.findElement( By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).click(); 
		driver.findElement( By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a[text()='19']")).click();
		driver.findElement(By.id("country3Txt")).click();
		Select drpcountry = new Select (driver.findElement(By.id("country3Txt")));
		drpcountry.selectByVisibleText("AUSTRALIA");
		driver.findElement(By.id("1")).sendKeys("speakers");
		driver.findElement(By.id("2")).sendKeys("3");
		driver.findElement(By.id("3")).sendKeys("234");
		driver.findElement(By.id("4")).sendKeys("laptop");
		driver.findElement(By.id("rmavalue_1")).sendKeys("12352");
		driver.findElement(By.id("orderidTxt_1")).sendKeys("123652");
		WebElement FileUpload = driver.findElement(By.xpath("//*[@id=\"addinvoiceTxtMul_1\"]"));
		FileUpload.sendKeys("C:\\Users\\Jyotheeswar\\Pictures\\Saved Pictures\\bb.png");
		System.out.println("File is Uploaded Successfully");
		driver.findElement(By.xpath("//*[@id=\"userprofileFormOne\"]/div[7]/div/div/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/header/nav/div/div/div[2]/div[2]/div[2]/div/div/ul/li[1]/a")).click();
}
 @AfterMethod
  public void postLogin()
  {
  System.out.println(driver.getCurrentUrl());
}
 @AfterClass
 public void afterClass()
 {
 driver.quit();
}
}