package homework14032020;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigateToRegisterPage {

    WebDriver driver;
    @Before
    public void openBrowser(){


            String baseUrl = "https://demo.nopcommerce.com/";
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseUrl);

        }
        @Test
        public void verifyUserShouldNavigateToRegisterPage() {
            WebElement register =
                    driver.findElement(By.linkText("Register"));
            register.click();
            WebElement welcomeText = driver.findElement(By.xpath("//strong[contains(text(),'Your Personal Details')]"));
            String expectedText = "Your Personal Details";
            String actualText = welcomeText.getText();

            Assert.assertEquals(expectedText, actualText);

        }
        @After
        public void closeBrowser() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }







        }
