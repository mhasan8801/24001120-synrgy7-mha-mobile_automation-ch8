package ChallangeChapter8.page;

import ChallangeChapter8.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CheckoutOverviewPage extends BasePage {

    By productName1 = AppiumBy.xpath("(//*[contains(@content-desc,\"test-Description\")])[1]");

    By productName2 = AppiumBy.xpath("(//*[contains(@content-desc,\"test-Description\")])[2]");

    By finishButton = AppiumBy.accessibilityId("(test-FINISH");


    public void verifyProductInOverview(){
        driver.findElement(productName1).isDisplayed();
        driver.findElement(productName2).isDisplayed();
    }

    public void clickFinishButton(){
        scrollToElement(finishButton);
        driver.findElement(finishButton).click();
    }
}
