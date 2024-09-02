package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import steps.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {
    WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.username("standard_user");
        loginPage.password("secret_sauce");
    }

    @When("User enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        loginPage.username("invalid_user");
        loginPage.password("invalid_password");
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.btnLogin();
    }

    @Then("User should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @Then("User should see an error message")
    public void user_should_see_an_error_message() {
        Assert.assertTrue(loginPage.getErrorMessage().contains("Username and password do not match"));
    }

    @When("User leaves username and password fields empty")
    public void user_leaves_username_and_password_fields_empty() {
        loginPage.username("");
        loginPage.password("");
    }

