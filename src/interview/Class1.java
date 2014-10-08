package interview;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Class1 {

	private WebDriver driver;
	private String url;
	
	
	@BeforeTest 
	public void func1(){
		driver = new FirefoxDriver();
		url = "http://www.about.com";
		
	}
	
	
	@Test
	public void func2() throws Exception {
		
		driver.get(url);
		driver.findElement(By.cssSelector("div.search > form.search-form > fieldset > div.search-container > div.search-inner > div.search-box > div.search-box-inner > input[name=\"q\"]")).sendKeys("selenium");
		driver.findElement(By.cssSelector("div.search > form.search-form > fieldset > div.search-container > div.search-inner.search-btn > button[type=\"submit\"]")).click();
		System.out.println("we found webpage and no error"); 
		
	}
	
	
	
	
	@AfterTest 
	public void func3(){
		
	driver.quit();
	System.out.println("Browser closed"); 
		
	}
	
	
	
	
	

}
