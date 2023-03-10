import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CareerPageTest {
  private WebDriver driver;

  @BeforeTest
  public void setupTest() {
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    driver = new ChromeDriver();
  }

  @Test
  public void fillOutCareerForm() {
    driver.get("https://www.moveo.group/");
    WebElement careerLink = driver.findElement(By.cssSelector("#menu-item-6131 > a"));
    careerLink.click();

    WebElement applyNowButton = driver.findElement(By.cssSelector("#apply-now-button"));
    applyNowButton.click();

    WebElement nameField = driver.findElement(By.cssSelector("#candidate-name"));
    nameField.sendKeys("TEST - automation candidate");

    // Fill out the rest of the form with sample data

    WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
    submitButton.click();

    // Verify that the form was submitted successfully
    WebElement successMessage = driver.findElement(By.cssSelector("#success-message"));
    Assert.assertTrue(successMessage.isDisplayed());
  }

  @AfterTest
  public void teardownTest() {
    driver.quit();
  }
}
