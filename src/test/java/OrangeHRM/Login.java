package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Login {
    WebDriver driver;

    @BeforeClass // testNG
    public void setDriver() {
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait for all the project
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @AfterClass //@AfterTest
    public void close(){

        driver.quit();
    }
    @Test
    public void login() {
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        String text =driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals("Dashboard",text);

        // find by link text in xpath , also can use partial link text
        text=driver.findElement(By.xpath("//span[text()='Admin']")).getText();
        Assert.assertEquals("Admin",text);

    }
}
/*
 so  we need to increase code reusability , mantinability , Redability
 by using POM page object model , POM.xml file
 */
