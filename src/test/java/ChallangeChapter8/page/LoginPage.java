package ChallangeChapter8.page;

import ChallangeChapter8.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    By usernameField = AppiumBy.accessibilityId("test-Username");

    By passwordField = AppiumBy.accessibilityId("test-Password");

    By loginButton = AppiumBy.accessibilityId("test-LOGIN");

    By errorMessageLogin = AppiumBy.xpath("//*[contains(@content-desc,\"test-Error message\")]");


    public void seeErrorMessageLogin(){

        wait.until(ExpectedConditions.presenceOfElementLocated(errorMessageLogin));
    }
    public void userOnLoginPage(){
        driver.findElement(usernameField).isDisplayed();
        driver.findElement(passwordField).isDisplayed();
        driver.findElement(loginButton).isDisplayed();
    }

    public void inputUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

}
