package ChallangeChapter8.page;

import ChallangeChapter8.BasePage;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class CardPage extends BasePage {

    By productName1 = AppiumBy.xpath("(//*[contains(@content-desc,\"test-Description\")])[1]");

    By productName2 = AppiumBy.xpath("(//*[contains(@content-desc,\"test-Description\")])[2]");

    By checkoutButton = AppiumBy.accessibilityId("test-CHECKOUT");

    public void verifyProductInCardPage(){
        driver.findElement(productName1).isDisplayed();
        driver.findElement(productName2).isDisplayed();
    }

    public void clickCheckoutButton(){
        scrollToElement(checkoutButton);
        driver.findElement(checkoutButton).click();
    }

}
