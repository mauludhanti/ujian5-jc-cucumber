package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCodeField;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errorMessage;

    public void firstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void lastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void postalCode(String postalCode) {
        postalCodeField.sendKeys(postalCode);
    }

    public void continueButton() {
        continueButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}