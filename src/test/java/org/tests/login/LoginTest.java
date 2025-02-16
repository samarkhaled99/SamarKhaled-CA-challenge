package org.tests.login;

import org.pages.HomePage;
import org.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tests.TestBase;
import utilities.JsonFileManager;

public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    JsonFileManager testData;


@Test
    public void login() {

        // Create objects
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        //Login with valid credentials
        homePage.clickOnSignInButton();
        loginPage.clickOnLogIn();
        loginPage.setEmailField(testData.getTestData("validCredentials.email"));
        loginPage.setPasswordField(testData.getTestData("validCredentials.password"));
        loginPage.clickOnLoginButton();
    }
    @BeforeClass
    public void beforeClass() {
        testData = new JsonFileManager("src/test/java/org/tests/resources/login.json");
    }
}
