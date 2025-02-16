package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utilities;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    protected final By loginButton= By.xpath("//button[contains(text(),'Log in')]");

    protected final By emailField = By.xpath("(//input[@id='signInFormUsername'])[2]");

    protected final By passwordField = By.xpath("(//input[@id='signInFormPassword'])[2]");

    protected final By signInButton = By.xpath("(//input[@name='signInSubmitButton' and @type='Submit'])[2]");

    //actions
    public void clickOnLogIn(){
        Utilities.waitAndClickOnElement(loginButton,wait);
    }

    public void setEmailField(String value){
        Utilities.waitClearAndSetInputField(emailField,value,wait);
    }
    public void setPasswordField(String value){
        Utilities.waitClearAndSetInputField(passwordField,value,wait);
    }
    public void clickOnLoginButton(){
        Utilities.waitAndClickOnElement(signInButton,wait);
    }

}
