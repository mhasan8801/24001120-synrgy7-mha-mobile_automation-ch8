package ChallangeChapter8.stepdef;

import ChallangeChapter8.BasePage;
import ChallangeChapter8.page.CheckoutInformationPage;
import ChallangeChapter8.page.CheckoutOverviewPage;
import io.cucumber.java.en.And;

public class CheckoutOverviewStep extends BasePage {

    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();

    @And("The user verify product in checkout overview page")
    public void verifyProductInOverview(){
        checkoutOverviewPage.verifyProductInOverview();
    }

    @And("The user click finish button in checkout overview page")
    public void clickFinishButton(){
        checkoutOverviewPage.clickFinishButton();
    }
}
