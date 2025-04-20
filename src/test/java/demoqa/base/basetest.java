package demoqa.base;

import com.demoqa.pages.HomePage;
import com.saucedemo.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class basetest {
    private WebDriver driver;
    protected PageBase BasePage;
    protected HomePage homePage;
    private String url = "https://www.demoqa.com/";

    @BeforeClass
    public void setDriver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeMethod
    public void OpenApp(){
        driver.get(url);
        BasePage = new PageBase();
        BasePage.setDriver(driver);
        homePage = new HomePage();
    }
    @AfterClass
    public void close(){
        driver.close();
    }


}
