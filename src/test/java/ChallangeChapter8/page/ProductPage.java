package ChallangeChapter8.page;

import ChallangeChapter8.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ProductPage extends BasePage {

    private double price1;
    private double price2;

    By productsLabel = AppiumBy.xpath("(//*[@text=\"PRODUCTS\"])");

    By productName1 = AppiumBy.xpath("(//*[contains(@content-desc,\"test-Item title\")])[1]");

    By productName2 = AppiumBy.xpath("(//*[contains(@content-desc,\"test-Item title\")])[2]");

    By productPrice1 = AppiumBy.xpath("(//*[contains(@content-desc,\"test-Price\")])[1]");

    By productPrice2 = AppiumBy.xpath("(//*[contains(@content-desc,\"test-Price\")])[2]");

    By addToCardButtonProduct1 = AppiumBy.xpath("(//*[contains(@content-desc,\"test-ADD TO CART\")])[1]");

    By addToCardButtonProduct2 = AppiumBy.xpath("(//*[contains(@content-desc,\"test-ADD TO CART\")])[2]");

    By sortButton = AppiumBy.accessibilityId("test-Modal Selector Button");

    By lowToHighOption = AppiumBy.xpath("(//*[@text=\"Price (low to high)\"])");

    By cardButton = AppiumBy.accessibilityId("test-Cart");


    public void clickCardButton(){
        driver.findElement(cardButton).click();
    }
    public void addToCardProduct1(){
        driver.findElement(addToCardButtonProduct1);
    }

    public void addToCardProduct2(){
        driver.findElement(addToCardButtonProduct2);
    }

    public void redirectedToProductPage(){
        driver.findElement(productsLabel).isDisplayed();
        driver.findElement(productName1).isDisplayed();
        driver.findElement(productName2).isDisplayed();
    }

    public void clickSortButton(){
        driver.findElement(sortButton).click();
    }

    public void clickLowToHighOption(){
        driver.findElement(lowToHighOption).click();
    }

    public boolean sortingHighToLow(){

        //simpan value harga produk 1 dan 2 ke variable
        var price1String = driver.findElement(productPrice1).getText();
        var price2String = driver.findElement(productPrice2).getText();

        //pharsing tipedata ke double dan replace '$'
        price1 = Double.parseDouble(price1String.replace("$", ""));
        price2 = Double.parseDouble(price2String.replace("$", ""));

        //verify price produk 1 lebih mahar daripada produk 2
        return price1 > price2;
    }

    public void verifyLowToHigh(){
        Assert.assertTrue(sortingHighToLow());
    }
}
