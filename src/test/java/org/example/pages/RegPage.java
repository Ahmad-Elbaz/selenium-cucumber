package org.example.pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

public class RegPage {

    public WebElement registerlink(){

        WebElement reg = Hooks.driver.findElement(By.className("ada"));
        return reg;

    }

    public void SetDriver(String url){
        Hooks.driver.get(url);

    }



        // make constructor
    public RegPage(){
        // use selenium class page factory
        // first input driver , the page this

        PageFactory.initElements(Hooks.driver,this);

    }
    // use of constractor method is as method used above
    @FindBy(className = "sdgds") public WebElement registerlink ;
    @FindBy(className = "male") public WebElement male;
    @FindBy(id = "FirstName") public WebElement Firstname;
    @FindBy(id = "LastName")public WebElement LastName;

    @FindBy(name = "DateOfBirthDay") public WebElement Day ;
//     public Select selectDay = new Select(Day);
    @FindBy(name = "DateOfBirthMonth") public WebElement Month ;
//    public Select selectMonth = new Select(Month);
    @FindBy(name = "DateOfBirthYear") public WebElement Year ;
//    public Select selectYear = new Select(Year);
    @FindBy(id = "Email") public WebElement Email;
    @FindBy(id = "Company") public WebElement Company;
    @FindBy(id = "Newsletter") public WebElement Newsletter;
    @FindBy(id = "Password") public WebElement password;
    @FindBy(id = "ConfirmPassword") public WebElement confpassword;
//    @FindBy(id = "register-button") public WebElement registerButton;

    // another method to find by using FindAll
    // its a class
    @FindAll({
            @FindBy(id = "register-button"),
            @FindBy(name = "register-button")
    })public WebElement registerButton;



    @FindBy(css = "[class='result']") public WebElement confMessage ;

//    @FindBy (how = How.ID,using = "register-button"); // another method to use find by


//    @FindBys() find all items have ALL the parameters
//    @FindAll() find all items have any of the parameters





}
