package ChallangeChapter8.page;

import ChallangeChapter8.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CheckoutInformationPage extends BasePage {

    By firstNameField = AppiumBy.accessibilityId("test-First Name");

    By lastNameField = AppiumBy.accessibilityId("test-Last Name");

    By postalCodeField = AppiumBy.accessibilityId("test-Zip/Postal Code");

    By continueButton = AppiumBy.accessibilityId("test-CONTINUE");

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public void inputFirstName(String firstname){
        driver.findElement(firstNameField).sendKeys(firstname);
    }

    public void inputLastName(String lastname){
        driver.findElement(lastNameField).sendKeys(lastname);
    }

    public void inputPostalCode(String postalCode){
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }
}
