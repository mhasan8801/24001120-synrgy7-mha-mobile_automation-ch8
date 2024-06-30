package ChallangeChapter8.page;

import ChallangeChapter8.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CheckoutCompletePage extends BasePage {

    By checkoutCompleteLabel = AppiumBy.xpath("(//*[@text=\"CHECKOUT: COMPLETE!\"])");

    By thankYouForOrderLabel = AppiumBy.xpath("(//*[@text=\"THANK YOU FOR YOU ORDER\"])");

    public void verifyCheckoutComplete(){
        driver.findElement(checkoutCompleteLabel).isDisplayed();
        driver.findElement(thankYouForOrderLabel).isDisplayed();
    }

}
