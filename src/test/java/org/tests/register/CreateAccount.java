package org.tests.register;

import org.pages.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tests.TestBase;
import utilities.JsonFileManager;


public class CreateAccount extends TestBase {
    JsonFileManager testData;
    HomePage homePage;
    RegisterPage registerPage;

    @Test
    public void CreateAccountSuccessfullyTest(){
        homePage =new HomePage(driver);
        registerPage = new RegisterPage(driver);


        homePage.clickOnSignInButton();
        registerPage.clickOnCreateAccountButton();
        registerPage.setRegisterEmailAddress(testData.getTestData("validCredentials.email"));
        registerPage.clickOnContinueBtn();
        registerPage.setFirstName(testData.getTestData("validCredentials.firstName"));
        registerPage.setLastName(testData.getTestData("validCredentials.lastName"));
        registerPage.setPostalCode(testData.getTestData("validCredentials.postalCode"));
        registerPage.selectDogCount(testData.getTestData("validCredentials.dogCount"));
        registerPage.selectCatCount(testData.getTestData("validCredentials.catCount"));
        registerPage.clickOnSecondContinueBtn();
        registerPage.SetPasswordAndConfirmIt(testData.getTestData("validCredentials.password"));
        registerPage.clickOnCreateAccountBtn();

    }
    @BeforeClass
    public void beforeClass() {
        testData = new JsonFileManager("src/test/java/org/tests/resources/register.json");
    }

}
