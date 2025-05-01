package org.example.StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.cucumber.java.eo.Se;
import org.example.pages.RegPage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.Locale;
import java.util.Objects;

public class Reg {
    RegPage register= new RegPage();


    @Given("user open reg page")
    public void user_open_reg_page() {

        register.SetDriver("https://demo.nopcommerce.com/register?returnUrl=%2F");

//        register.registerlink.click();


        // Write code here that turns the phrase above into concrete actions
//        Hooks.driver.findElement(By.className("ico-register")).click();
        //(//*[@class='form-fields'])[1] register list of form
        //*[@class='page registration-page']
//        Hooks.driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        System.out.println("navigate to register page in method");



    }

    @When("user select gender")
    public void user_select_gender() {
        // Write code here that turns the phrase above into concrete actions
        register.male.click();

    }

    // alt + shift + enter to create new step defination


    @And("sdfd")
    public void sdfd() {

    }

    @And("user Enter First Name {string}")
    public void userEnter(String arg0) {

            register.Firstname.sendKeys(arg0);

    }
    @And("user Enter Second Name {string}")
    public void userEnterr(String arg0) {

        register.LastName.sendKeys(arg0);

    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {

        // Select is used to handle static lists with tagname (select)
        Select Days = new Select(register.Day);

        Days.selectByIndex(1); // index is the arrange of element in the list
        Select Months = new Select(register.Month);
        Months.selectByIndex(1);

        Months.selectByContainsVisibleText("Februa");// take long time

        Select Years = new Select(register.Year);
        Years.selectByIndex(34);

//        register.selectDay.selectByIndex(1);
//        register.selectMonth.selectByIndex(1);
//        register.selectYear.selectByIndex(3);

    }

    @And("Enter email{string}")
    public void enterEmail(String arg0) {
        //generate random email
        Faker faker = new Faker();
        String fakemail = faker.internet().safeEmailAddress();
        register.Email.sendKeys(fakemail);
        System.out.println(fakemail);
    }

    @And("Enter company {string}")
    public void enterCompany(String arg0) {
        register.Company.sendKeys(arg0);
    }

    @And("check box is selected")
    public void checkBoxIsSelected() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(register.Newsletter.isSelected(),"the check box is not selected");
        softAssert.assertAll();
    }

    @And("enter password {string}")
    public void enterPassword(String arg0) {

        register.password.sendKeys(arg0);
        register.confpassword.sendKeys(arg0 );
    }

    @And("click reg button")
    public void clickRegButton() {

        register.registerButton.click();
    }

    @Then("user fill form successfully")
    public void user_fill_form_successfully() {
        // Write code here that turns the phrase above into concrete actions
        String actual = register.confMessage.getText().toLowerCase();
        // to lower case to avoid caps error
        String expected = "Your registration completed" ;
        // assert messsage viewed to user
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actual.contains("your registration completed"),"messsage not viewed");
        //assert color of text viewed to user #4cb17c green
        // Cssvalue for style attributes
        String color = register.confMessage.getCssValue("color");
        color = Color.fromString(color).asHex();
        System.out.println(color);
        softAssert.assertEquals(color,"#4cb17c","color is not green");
        softAssert.assertAll();


    }
}
