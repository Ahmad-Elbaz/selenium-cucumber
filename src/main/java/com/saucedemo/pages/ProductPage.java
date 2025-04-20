package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductPage extends PageBase{ // to be returned trom loginpage

    private By productheader = By.xpath("//span[@class='title']");

    public boolean productdisplayed(){
        return find(productheader).isDisplayed();// is displayed return boolean for view of the webelement
    }

}
