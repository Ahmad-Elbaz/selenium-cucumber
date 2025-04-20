package saucedemo.base;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class baseTest {

    protected WebDriver driver;
    protected PageBase pageBase;
    protected LoginPage loginPage;
    private String url ="https://www.saucedemo.com/";

    @BeforeClass
    public void Setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        pageBase = new PageBase() ;
        pageBase.setDriver(driver);
        loginPage=new LoginPage();

    }

    @AfterTest
    public void close(){
        driver.close();
    }



}
