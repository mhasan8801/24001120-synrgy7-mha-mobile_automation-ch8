package ChallangeChapter8.stepdef;

import ChallangeChapter8.BasePage;
import ChallangeChapter8.page.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

public class ProductStep extends BasePage {

    ProductPage productPage = new ProductPage();

    @Then("The user is redirected to product page")
    public void redirectedToProductPage(){
        productPage.redirectedToProductPage();
    }

    @And("The user click sort button")
    public void clickSortButton(){
        productPage.clickSortButton();
    }

    @When("The user select option price low to high")
    public void clickLowToHigh(){
        productPage.clickLowToHighOption();
    }

    @Then("The user verify product has been sort by price low to high")
    public void verifySortLowToHigh(){
        productPage.verifyLowToHigh();
    }

    @And("The user add to card product 2")
    public void addToCardProduct2(){
        productPage.addToCardProduct2();
    }

    @And("The user add to card product 1")
    public void addToCardProduct1(){
        productPage.addToCardProduct1();
    }

    @And("The user click card button")
    public void clickCardButton(){
        productPage.clickCardButton();
    }

}
