//For the bonus question, you can add an Allure report by using the Allure TestNG adapter.
// Here's an example of what the updated CareerPageTest class might look like:


import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(io.qameta.allure.testng.AllureTestListener.class)
public class CareerPageTest {
  private WebDriver driver;

  @BeforeTest
  public void setupTest() {
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    driver = new ChromeDriver();
  }

  @Test
  @
