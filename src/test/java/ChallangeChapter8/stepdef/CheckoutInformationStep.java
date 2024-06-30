package ChallangeChapter8.stepdef;

import ChallangeChapter8.BasePage;
import ChallangeChapter8.page.CheckoutInformationPage;
import io.cucumber.java.en.And;

public class CheckoutInformationStep extends BasePage {

    CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage();

    @And("The user input {string} in first name checkout information")
    public void inputFirstName(String firstname){
        checkoutInformationPage.inputFirstName(firstname);
    }

    @And("The user input {string} in last name checkout information")
    public void inputLastName(String lastname){
        checkoutInformationPage.inputLastName(lastname);
    }

    @And("The user input {string} in postal code checkout information")
    public void inputPostalCode(String postalCode){
        checkoutInformationPage.inputPostalCode(postalCode);
    }

    @And("The user click continue button on checkout information")
    public void clickContinueButton(){
        checkoutInformationPage.clickContinueButton();
    }

}
