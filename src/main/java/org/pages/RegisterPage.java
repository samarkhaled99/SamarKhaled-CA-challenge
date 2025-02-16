package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Utilities;

public class RegisterPage extends PageBase {


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private final By RegisterButton = By.xpath("//button[contains(text(),'Create Account')]");

    private final By EmailAddressField = By.id("emailAddress");
    private final By continueBtn = By.xpath("//button[@type='submit' and contains(@class, 'pds-bg-primary')]");
    private final By secondContinueBtn = By.xpath("//button[contains(text(),'Continue')]");
    private final By closePopUP = By.xpath("//button[contains(@class, 'onetrust-close-btn-handler') and @aria-label='Close']");
    private final By firstName = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By postalCode = By.id("postalCode");
    private final By dogCount = By.xpath("//div[@class='pds-w-full']//select[@name='dogCount']");
    private final By catCount = By.xpath("//div[@class='pds-w-full']//select[@name='catCount']");
    private final By password = By.cssSelector("#password");
    private final By confirmPassword = By.cssSelector("#confirmPassword");
    private final By createAccountBtn = By.xpath("//button[contains(text(),'Create Account')]");
    private final By agreeBtn = By.cssSelector("#terms");

    //Actions
    public void clickOnCreateAccountButton(){
        Utilities.waitAndClickOnElement(RegisterButton,wait);
    }

    public void setRegisterEmailAddress(String value) {
        Utilities.waitClearAndSetInputField(EmailAddressField, value, wait);
    }

    public void setFirstName(String value) {
        Utilities.waitClearAndSetInputField(firstName, value, wait);
    }

    public void setLastName(String value) {
        Utilities.waitClearAndSetInputField(lastName, value, wait);
    }

    public void setPostalCode(String value) {
        Utilities.waitClearAndSetInputField(postalCode, value, wait);
    }


    public void clickOnContinueBtn() {
        Utilities.waitAndClickOnElement(continueBtn, wait);
    }

    public void clickOnSecondContinueBtn() {
        Utilities.waitAndClickOnElement(closePopUP, wait);
        Utilities.waitAndClickOnElement(secondContinueBtn, wait);
    }

    public void SetPasswordAndConfirmIt(String value) {
        Utilities.waitClearAndSetInputField(password, value, wait);
        Utilities.waitClearAndSetInputField(confirmPassword, value, wait);
    }

    public void clickOnCreateAccountBtn() {
        Utilities.waitAndClickOnElement(agreeBtn, wait);
        Utilities.waitAndClickOnElement(createAccountBtn, wait);
    }

    public void selectDogCount(String value) {
        WebElement dogCountDropDown = driver.findElement(dogCount);
        Utilities.waitAndSelectByValue(dogCountDropDown, value, wait);
    }

    public void selectCatCount(String value) {
        WebElement catCountDropDown = driver.findElement(catCount);
        Utilities.waitAndSelectByValue(catCountDropDown, value, wait);
    }

}
