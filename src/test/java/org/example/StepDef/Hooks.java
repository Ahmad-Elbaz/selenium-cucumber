package org.example.StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;
//import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Hooks {
    public  static WebDriver driver;
    @Before
    public  static void OpenBrowser(){
        System.out.println("user open browser");
        String url = "https://demo.nopcommerce.com";

        //set
//        WebDriverManager.chromedriver().setup();

        //to add extention if needed
        ChromeOptions extensions = new ChromeOptions();

        driver =new ChromeDriver();

        driver.manage().window().maximize();

        //configration and implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // get
        driver.get(url);



        // soft assertion
        SoftAssert softAssert=new SoftAssert();
//         assert all comamnd (use in methods)
//        softAssert.assertAll();


        System.out.println("user navigate home page in hook");

    }

    @After
    public static void close() throws InterruptedException {

        System.out.println("close the browser");
        Thread.sleep(2000);
        driver.close();
    }
}
