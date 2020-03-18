package homework14032020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo {
    public static void main(String[] args) throws
            InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        Thread.sleep(3000);
        WebElement genderfield=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
        genderfield.click();


        WebElement firstName=driver.findElement(By.id("FirstName"));
        firstName.sendKeys("LAMEERTHA");

        WebElement lastName=driver.findElement(By.id("LastName"));
        lastName.sendKeys("THEVARAJAH");

        WebElement dateOfBirthDropDown = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        dateOfBirthDropDown.sendKeys("11");


        WebElement dateOfBirthDropDown1 = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        dateOfBirthDropDown1.sendKeys("June");


        WebElement dateOfBirthDropDown2 = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        dateOfBirthDropDown2.sendKeys("1988");


        WebElement enterEmailAddress=driver.findElement(By.xpath("//input[@id='Email']"));
        enterEmailAddress.sendKeys("lameethev2@gmail.com");

        WebElement enterTheCompanyName=driver.findElement(By.id("Company"));
        enterTheCompanyName.sendKeys("GSR IMPEX LTD");

        WebElement clickNewsLetterBtn=driver.findElement(By.xpath("//input[@id='Newsletter']"));
        clickNewsLetterBtn.click();

        WebElement passwordButton=driver.findElement(By.xpath("//input[@name='Password']"));
        passwordButton.sendKeys("lamee2020");

        WebElement confirmPasswordButton=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
        confirmPasswordButton.sendKeys("lamee2020");

        WebElement registerbutton=driver.findElement(By.xpath("//input[@name='register-button']"));
        registerbutton.click();




    }
}