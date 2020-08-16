package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("tryCloud_url"));
    }

    @Then("User puts the username")
    public void user_puts_the_username() {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @Then("User puts the password")
    public void user_puts_the_password() {
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @Then("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }


}
