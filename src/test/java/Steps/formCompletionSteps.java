package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class formCompletionSteps extends CommonMethods {
    @Given("The user is logged in as an applicant")
    public void the_user_is_logged_in_as_an_applicant() {
        String applicantTitle = "USCIS RAPID Challenge Test #2";
        //Assert that the Title is correct
        String actualTitle = driver.getTitle();
        Assert.assertEquals(applicantTitle, actualTitle);
    }

    @When("The user clicks on Start new Form for an I999 Form")
    public void the_user_clicks_on_start_new_form() throws InterruptedException {
        //Locate the Start New Form element and then click on it
        WebElement startFormI999 = driver.findElement(By.xpath("//*[@id=\"forms-dashboard\"]/div/div[2]/div[1]/div/div/div/button"));
        click(startFormI999);
    }

    @When("The user fills out the form correctly")
    public void the_user_fills_out_the_form_correctly() throws InterruptedException {
        //User starts the form
        WebElement startBtn = driver.findElement(By.cssSelector("#form-instructions > div > div:nth-child(3) > div > button"));
        click(startBtn);
        //
    }

    @Then("The user will have successfully completed a Form I999")
    public void the_user_will_have_successfully_completed_a_form_i() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user starts an I131 form")
    public void theUserStartsAnIForm() {
    }

    @And("The user fills out the I131 Form correctly")
    public void theUserFillsOutTheIFormCorrectly() {
    }
}


