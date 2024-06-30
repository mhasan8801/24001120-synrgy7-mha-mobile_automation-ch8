package ChallangeChapter8;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BasePage {

    protected static AndroidDriver driver;

    protected static WebDriverWait wait;

    public static void setupDriver(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","14.0");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage","com.swaglabsmobileapp");
        caps.setCapability("appActivity",".MainActivity");

        driver = new AndroidDriver(caps);
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
    }

    public static void stopDriver(){
        driver.quit();
    }

    public static void resetApp(){
        driver.terminateApp("com.swaglabsmobileapp");
        driver.activateApp("com.swaglabsmobileapp");
    }

    public void scrollToElement(By by) {
        int maxScroll = 5;  // Set a limit to the number of scrolls to avoid infinite loops
        int scrollCount = 0;

        while (!isElementDisplayed(by) && scrollCount < maxScroll) {
            scrollDown();
            scrollCount++;
        }
    }

    private void scrollDown() {
        Dimension dimension = driver.manage().window().getSize();
        int startX = dimension.width / 2;
        int startY = (int) (dimension.height * 0.8);
        int endY = (int) (dimension.height * 0.2);

        new TouchAction<>(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    private boolean isElementDisplayed(By by) {
        try {
            return driver.findElement(by).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
