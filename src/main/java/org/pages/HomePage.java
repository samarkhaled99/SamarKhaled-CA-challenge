package org.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utilities;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private final By signIn = By.xpath("//span[contains(text(),'Sign In')]");

    //Actions
    public void clickOnSignInButton(){ Utilities.waitAndClickOnElement(signIn,wait); }

}
