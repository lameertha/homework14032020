package homework14032020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOne {
    public static void main(String[] args) {
        String baseUrl="https://www.google.co.uk/";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        WebElement GoogleSearch=driver.findElement(By.xpath("//input[@name='q']"));
        GoogleSearch.sendKeys(new String[]{"nopcommerce demo store"});
        GoogleSearch.submit();
        WebElement nopcommerce=driver.findElement(By.xpath("//h3[contains(text(),'nopCommerce demo store')]"));
        nopcommerce.click();

        java.util.List<WebElement>links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (int i=1; i<=links.size(); i=i+1){
            System.out.println(links.get(i).getText());
        }


    }

}
