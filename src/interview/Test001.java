package interview;



import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test001 {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.about.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled2() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("div.search > form.search-form > fieldset > div.search-container > div.search-inner > div.search-box > div.search-box-inner > input[name=\"q\"]")).clear();
    driver.findElement(By.cssSelector("div.search > form.search-form > fieldset > div.search-container > div.search-inner > div.search-box > div.search-box-inner > input[name=\"q\"]")).sendKeys("sele");
    driver.findElement(By.cssSelector("div.search > form.search-form > fieldset > div.search-container > div.search-inner > div.search-box > div.search-box-inner > input[name=\"q\"]")).clear();
    driver.findElement(By.cssSelector("div.search > form.search-form > fieldset > div.search-container > div.search-inner > div.search-box > div.search-box-inner > input[name=\"q\"]")).sendKeys("selenium");
    driver.findElement(By.cssSelector("div.search > form.search-form > fieldset > div.search-container > div.search-inner.search-btn > button[type=\"submit\"]")).click();
    driver.findElement(By.linkText("Our Story")).click();
    driver.findElement(By.cssSelector("img[alt=\"About.com\"]")).click();
    driver.findElement(By.linkText("About.com")).click();
    driver.findElement(By.xpath("//header[@id='header']/div/div/div/div[3]/a")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | gtm_autoEvent_1408912284854 | 30000]]
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
