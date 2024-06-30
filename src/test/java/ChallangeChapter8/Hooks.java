package ChallangeChapter8;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {


    @BeforeAll
    public static void beforeAll() {
        BasePage.setupDriver();
    }

    @AfterAll
    public static void afterAll() {
        BasePage.stopDriver();
    }

    @After
    public static void after() {
        BasePage.resetApp();
    }

}
