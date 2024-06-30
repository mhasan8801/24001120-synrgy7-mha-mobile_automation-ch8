package ChallangeChapter8.stepdef;

import ChallangeChapter8.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    @Given("The user is on login page")
    public void onLoginPage(){
        loginPage.userOnLoginPage();
    }

    @And("The user input username with {string}")
    public void inputUsername(String username){
        loginPage.inputUsername(username);
    }

    @And("The user input password with {string}")
    public void inputPassword(String password){
        loginPage.inputPassword(password);
    }

    @When("The user click on login button")
    public void clickLoginButton(){
        loginPage.clickLogin();
    }

    @Then("The user get error message login")
    public void getErrorMessageLogin(){
        loginPage.seeErrorMessageLogin();
    }

}
