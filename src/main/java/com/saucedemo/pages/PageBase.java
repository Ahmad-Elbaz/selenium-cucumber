package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        PageBase.driver = driver;

    }
    // protected to be only used in PageBase
    protected WebElement find(By locator){
        return driver.findElement(locator);

    }

    protected void set(By locator , String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }
    protected void click(By locator){
//        find(locator).clear();
        find(locator).click();
    }
}
