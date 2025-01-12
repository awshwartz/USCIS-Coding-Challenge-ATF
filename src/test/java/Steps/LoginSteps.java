package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("the user is on the main login page")
    public void theUserIsOnTheMainLoginPage() throws InterruptedException {
        openBrowserAndLaunchApplication();
        //User clicks on login button on the main splash page
        WebElement login = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div[2]/button"));
        click(login);
    }
    //CORRECT LOGIN INFORMATION
    @When("the user enters the correct login information")
    public void theUserEntersTheCorrectLoginInformation() throws InterruptedException {
        WebElement usernameField = driver.findElement(By.id("username"));
        sendText(usernameField, ConfigReader.getPropertyValue("usernameApplicant"));
        WebElement passwordField = driver.findElement(By.id("password"));
        sendText(passwordField, ConfigReader.getPropertyValue("passwordApplicant"));
        WebElement loginBtn = driver.findElement(By.id("kc-login"));
        click(loginBtn);
    }

    @Then("the user will be successfully logged in")
    public void theUserWillBeSuccessfullyLoggedIn() {
        takeScreenshot("successfulLogin.jpg");
    }
    //INCORRECT LOGIN INFORMATION
    @When("the user enters wrong login information")
    public void theUserEntersWrongLoginInformation() throws InterruptedException {
        //Send Wrong Username
        WebElement userNameField = driver.findElement(By.id("username"));
        sendText(userNameField, "test");
        WebElement passwordField = driver.findElement(By.id("password"));
        sendText(passwordField, "Test");
        WebElement loginBtn = driver.findElement(By.id("kc-login"));
        click(loginBtn);

    }

    @Then("the user will receive an error message and not be logged in")
    public void theUserWillReceiveAnErrorMessageAndNotBeLoggedIn() {
        takeScreenshot("incorrectLogin.jpg");
    }

    @When("the admin enters the correct login information")
    public void theAdminEntersTheCorrectLoginInformation() throws InterruptedException {
        WebElement usernameField = driver.findElement(By.id("username"));
        sendText(usernameField, ConfigReader.getPropertyValue("usernameAdmin"));
        WebElement passwordField = driver.findElement(By.id("password"));
        sendText(passwordField, ConfigReader.getPropertyValue("passwordAdmin"));
        WebElement loginBtn = driver.findElement(By.id("kc-login"));
        click(loginBtn);
    }

    @Then("the admin will be successfully logged in")
    public void theAdminWillBeSuccessfullyLoggedIn() {
        takeScreenshot("adminLogin.jpg");
    }
}
