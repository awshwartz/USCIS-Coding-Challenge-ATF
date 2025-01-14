package Steps;

import Pages.FormCompletionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    @When("The user fills out the form correctly")
    public void the_user_fills_out_the_form_correctly() throws InterruptedException {
        //User starts the form
        WebElement startFormBtn = driver.findElement(By.cssSelector("#forms-dashboard > div > div:nth-child(2) > div:nth-child(2) > div > div > div > button"));
        click(startFormBtn);
        //Assert that the user is on the Form I-131 page
        String formI131Title = "USCIS RAPID Challenge Test #2";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(formI131Title, actualTitle);
        //Click on the "Start" button to fill out the form
        WebElement startBtn  = driver.findElement(By.xpath("//*[@id=\"form-instructions\"]/div/div[3]/div/button"));
        click(startBtn);
        //User fills out the form in it's entirety
        //Gather the Elements!!
        //Fill out Name information


    }

    @When("The user starts an I131 form")
    public void theUserStartsAnIForm() {
    }

    @And("The user fills out the I131 Form correctly")
    public void theUserFillsOutTheIFormCorrectly() {
    }
}


