package ChallangeChapter8.stepdef;

import ChallangeChapter8.BasePage;
import ChallangeChapter8.page.CheckoutCompletePage;
import ChallangeChapter8.page.CheckoutInformationPage;
import io.cucumber.java.en.And;

public class CheckoutCompleteStep extends BasePage {

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @And("The user verify checkout complete")
    public void verifyCheckoutComplete(){
        checkoutCompletePage.verifyCheckoutComplete();
    }
}
