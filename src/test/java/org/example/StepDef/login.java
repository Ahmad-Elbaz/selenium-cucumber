package org.example.StepDef;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;


public class login {

    @Given("user open login page")
    public void user_open_login_driver() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user open registration page");
//        Hooks.driver.findElement(By.cssSelector("[href=\"/login\"]")).click();
//        Assert.assertTrue(false);
    }
    @When("user enter {string} {string} name and {string}")
    public void user_enter_valid_user_name_and_pass(String valid ,String user,String pass) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user log");

        Hooks.driver.findElement(By.id("username")).sendKeys(user);
        Hooks.driver.findElement(By.name("password")).sendKeys(pass);
        Hooks.driver.findElement(By.className("radius")).click();
//        Assert.assertTrue(false);
    }
    @Then("user login successfully")
    public void user_login_successfully() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user log");
    }


}
