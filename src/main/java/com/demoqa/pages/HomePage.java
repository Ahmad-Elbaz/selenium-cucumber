package com.demoqa.pages;

import com.saucedemo.pages.PageBase;
import org.openqa.selenium.By;


public class HomePage extends PageBase {
    private By formscards = By.xpath("//*[text()='Elements']");
    /**
     * also can find by xpath //*[text()='Elements'] or by link text Elements
     * or by absolute //div[@class='category-cards']//h5[text()='Elements']
     * or find array by //h5
     * //div[@class='category-cards']//h5
     **/
    public FormsPage gotoforms(){
        click(formscards);
        return new FormsPage();
    }

}
