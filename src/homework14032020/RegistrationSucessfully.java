package homework14032020;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationSucessfully {
    WebDriver driver;
    @Before
    public void openBrowser() {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
       @Test
        public void userDetail() throws InterruptedException {

           WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
           register.click();


           WebElement genderfield = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
           genderfield.click();


           WebElement firstName = driver.findElement(By.id("FirstName"));
           firstName.sendKeys("LAMEERTHA");

           WebElement lastName = driver.findElement(By.id("LastName"));
           lastName.sendKeys("THEVARAJAH");

           WebElement dateOfBirthDropDown = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
           dateOfBirthDropDown.sendKeys("11");


           WebElement dateOfBirthDropDown1 = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
           dateOfBirthDropDown1.sendKeys("June");


           WebElement dateOfBirthDropDown2 = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
           dateOfBirthDropDown2.sendKeys("1988");


           WebElement enterEmailAddress = driver.findElement(By.xpath("//input[@name='Email']"));
           enterEmailAddress.sendKeys("lameethev@yahoo.co.uk");

           WebElement enterTheCompanyName = driver.findElement(By.id("Company"));
           enterTheCompanyName.sendKeys("GSR IMPEX LTD");

           WebElement clickNewsLetterBtn = driver.findElement(By.xpath("//input[@id='Newsletter']"));
           clickNewsLetterBtn.click();

           WebElement passwordButton = driver.findElement(By.xpath("//input[@name='Password']"));
           passwordButton.sendKeys("lamee2020");

           WebElement confirmPasswordButton = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
           confirmPasswordButton.sendKeys("lamee2020");

           WebElement registerbutton = driver.findElement(By.xpath("//input[@name='register-button']"));
           registerbutton.click();

           WebElement registerMsg = driver.findElement(By.xpath("//div[@class=\"result\"]"));
           registerMsg.getText();

           Thread.sleep(3000);


           String expectedResult = "Your Registration Completed";
           String actualResult = registerMsg.getText();
           Assert.assertEquals(expectedResult, actualResult);
       }
       @After
        public void browserClosed(){
         driver.quit();




    }

}
