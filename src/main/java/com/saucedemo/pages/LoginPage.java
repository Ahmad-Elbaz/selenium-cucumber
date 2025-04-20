package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends PageBase{// to interent the page base methods
    private By user = By.id("user-name");
    private By pass = By.id("password");
    private By button = By.id("login-button");
    private By error = By.cssSelector("#login_button_container h3");

    public void setUser(String username) {
        set(user,username);
    }

    public void setPass(String password) {
        set(pass,password);
    }

    public ProductPage setButton() {
        click(button);
        return new ProductPage();
    }
    public ProductPage Login(String user,String pass){
        setUser(user);
        setPass(pass);
        return setButton();
    }

    public String getError() {
        return find(error).getText();
    }




}
