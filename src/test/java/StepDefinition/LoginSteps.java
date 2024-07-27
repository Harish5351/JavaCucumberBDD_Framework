package StepDefinition;

import Pages.LoginPage;
import Utils.ReadProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class LoginSteps {
    ReadProperties rp = new ReadProperties();
    String filepath = "Resources/Locators.properties";
    String testfilepath = "Resources/TestData.properties";
    LoginPage loginpage;
//    WebDriver driver;

    public LoginSteps() {
        loginpage = new LoginPage();
    }

    @Given("User is on {string} page")
    public void user_is_on_page(String pageName) {
        System.out.println("page name: " +pageName);
        System.out.println("User is on " + pageName + " page");
        loginpage.LaunchApplication();
    }

    @When("User enters username {string}")
    public void user_enters_username(String uname) throws IOException {
        String locator = rp.ReadFile(filepath, uname);
        String value = rp.ReadFile(testfilepath, uname);
        loginpage.enterUsername(locator, value);
    }

    @When("User enters password {string}")
    public void user_enters_password(String upwd) throws IOException {
        String locator = rp.ReadFile(filepath, upwd);
        String value = rp.ReadFile(testfilepath, upwd);
        loginpage.enterPassword(locator, value);
    }

    @When("User clicks on {string} Button")
    public void user_clicks_on_button(String button) throws IOException {
        String locator = rp.ReadFile(filepath, button);
        loginpage.clickButton(locator);
    }

    @Then("User verifies {string} displayed on page")
    public void user_verifies_displayed_on_page(String element) throws IOException {
        String locator = rp.ReadFile(filepath, element);
        String value = rp.ReadFile(testfilepath, element);
        loginpage.verifyElement(locator, value);
    }
}
