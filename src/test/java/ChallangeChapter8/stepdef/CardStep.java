package ChallangeChapter8.stepdef;

import ChallangeChapter8.BasePage;
import ChallangeChapter8.page.CardPage;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class CardStep extends BasePage {

    CardPage cardPage = new CardPage();

    @Then("The user verify product in card page")
    public void verifyProductInCardPage(){
        cardPage.verifyProductInCardPage();
    }

    @And("The user click checkout button on card page")
    public void clickCheckoutButton(){
        cardPage.clickCheckoutButton();
    }

}
