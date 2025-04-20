package saucedemo.test.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.base.baseTest;

public class login extends baseTest {

    @Test
    public void TestLoginError(){
        loginPage.setUser("standard_user");
        loginPage.setPass("jyhf");
        var productPage=loginPage.setButton();
        String actualerror = loginPage.getError();
        String expectedsrror ="Epic sadface: Username and password do not match any user in this service";
//        Assert.assertEquals(actualerror,expectedsrror);
        // Also can assert text contains
        Assert.assertTrue(actualerror.contains("Epic sadface"));

    }

}
