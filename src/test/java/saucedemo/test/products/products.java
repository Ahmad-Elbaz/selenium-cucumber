package saucedemo.test.products;

import com.saucedemo.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.base.baseTest;

public class products extends baseTest {

    @Test
    public void headerdisplay(){
        ProductPage productPage = loginPage.Login("standard_user","secret_sauce");
        Assert.assertTrue(productPage.productdisplayed(),"\n header is displayed \n");



    }
}
