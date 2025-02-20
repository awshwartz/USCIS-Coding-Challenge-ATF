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

import java.io.IOException;

public class formCompletionSteps extends CommonMethods {

    @Given("The user is logged in as an applicant")
    public void the_user_is_logged_in_as_an_applicant() {
        String applicantTitle = "Applicant Dashboard";
        //Assert that the Title is correct
        String actualTitle = driver.getTitle();
        Assert.assertEquals(applicantTitle, actualTitle);
    }

    @When("The user fills out the form correctly")
    public void the_user_fills_out_the_form_correctly() throws InterruptedException {



        //Assert that the user is on the Form I-131 page
        String formI131Title = "I-131, Application for Travel Documents, Parole Documents, and Arrival/Departure Records";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(formI131Title, actualTitle);
        //User fills out the form the first page of the form
        WebElement areYouBtn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[1]/div[1]/label"));
        click(areYouBtn);
        //Select Form Type
        WebElement slctAppType = driver.findElement(By.id("applicationTypeCd"));
        sendText(slctAppType, "TRAV_AUTH_DOC");
        //Permanent Resident Bubble (Click NO)
        WebElement permResBtnYes = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[3]/div[2]"));
        click(permResBtnYes);
        //Q4 Bubble Button (Click NO)
        WebElement q4BtnNo = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[4]/div[2]"));
        click(q4BtnNo);
        //Q5 Bubble Button (Click YES)
        WebElement q5BtnYes = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[5]/div[1]"));
        click(q5BtnYes);
        //Q6 Bubble Button (Click YES)
        WebElement q6BtnYes = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[6]/div[1]"));
        click(q6BtnYes);
        //Click checkbox for Receipt Number
        WebElement receiptCheck = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[7]/div/label"));
        click(receiptCheck);
        //Fill in receipt number
        WebElement receiptField = driver.findElement(By.id("receiptNumber"));
        sendText(receiptField, "123456789");
        //User moves onto the second page
        Thread.sleep(1000);
        WebElement nextBtn1 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[2]/div[1]/button[2]"));
        click(nextBtn1);

        WebElement aboutApplicantPage = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[1]/ul/li[2]/a"));
        //click(aboutApplicantPage);
        //Gather Elements for Page 2
        WebElement firstNameField = driver.findElement(By.name("givenName"));
        WebElement lastNameField = driver.findElement(By.name("familyName"));
        WebElement middleNameField = driver.findElement(By.name("middleName"));
        WebElement inCareOfField = driver.findElement(By.name("inCareOfName"));
        WebElement streetNumName = driver.findElement(By.name("streetNameNumber"));
        WebElement unitTypeDrpDwn = driver.findElement(By.name("unitType"));
        WebElement houseNmbrField = driver.findElement(By.name("number"));
        WebElement cityNameField = driver.findElement(By.name("cityTown"));
        WebElement stateDrpDwn = driver.findElement(By.name("state"));
        WebElement zipCodeField = driver.findElement(By.name("zipCode"));
        WebElement sameAddressCheck = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/div[8]/div[2]/fieldset/div/label"));
        WebElement aNumberField = driver.findElement(By.name("alienRegistrationNumber"));
        WebElement dobField = driver.findElement(By.id("dateOfBirth"));
        WebElement countryBirthField = driver.findElement(By.id("countryOfBirth"));
        WebElement countryCitizenField = driver.findElement(By.id("countryOfCitizenship"));
        WebElement genderMale = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/div[16]/div[1]/fieldset/div[1]/label"));
        WebElement coaField = driver.findElement(By.id("COA"));
        WebElement departNumField = driver.findElement(By.id("recentFormI94"));
        WebElement i94ExpireField = driver.findElement(By.id("expiredDateI94"));
        WebElement uspidField = driver.findElement(By.id("USPID"));



        //User information for second page
        String firstName = "John";
        String lastName = "Smith";
        String middleName = "Joe";
        String inCareOf = "Sally Johnson";
        String streetNameNumber = "742 Evergreen Terrace";
        String houseType = "house";
        String cityName = "Springfield";
        String stateName = "Virginia";
        String zipCode = "12345";
        String dob = "01/01/2000";
        String aNumber = "123456789";
        String homeCountry = "Columbia";
        String citizenCountry = "Columbia";
        String coa = "A";
        String departNumber = "123456";
        String I94Expire = "05/30/2026";
        String uspid = "A123456";


        //Fill out second page
        sendText(firstNameField, firstName);
        sendText(lastNameField, lastName);
        sendText(middleNameField, middleName);
        sendText(inCareOfField, inCareOf);
        sendText(streetNumName, streetNameNumber);
        sendText(unitTypeDrpDwn, houseType);
        sendText(cityNameField, cityName);
        sendText(stateDrpDwn, stateName);
        sendText(zipCodeField, zipCode);
        click(sameAddressCheck);
        sendText(aNumberField, aNumber);
        sendText(dobField, dob);
        sendText(countryBirthField, homeCountry);
        sendText(countryCitizenField, citizenCountry);
        click(genderMale);
        sendText(coaField, coa);
        sendText(departNumField, departNumber);
        sendText(i94ExpireField, I94Expire);
        sendText(uspidField, uspid);

        //Move onto Page 3
        Thread.sleep(1000);
        WebElement pg2NextBtn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[2]/div[1]/button[2]"));
        click(pg2NextBtn);


        //Elements from page 3
        WebElement ethinicityBtn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/div/fieldset[1]/div[1]"));
        WebElement raceAsian = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/div/fieldset[2]/div[2]/label"));
        WebElement heightFeet = driver.findElement(By.id("feet"));
        WebElement heightInches = driver.findElement(By.id("inches"));
        WebElement weightField = driver.findElement(By.id("weight"));
        WebElement eyeColorDrp = driver.findElement(By.id("eye-color"));
        WebElement hairColorDrp = driver.findElement(By.id("hair-color"));
        WebElement saveExit3 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[2]/div[2]/button[1]"));

        //user information for page 2
        String heightFt = "5";
        String heightIn = "11";
        String weight = "165";
        String eyeColor = "brown";
        String hairColor = "black";

        //Fill out the third page
        click(ethinicityBtn);
        click(raceAsian);
        sendText(heightFeet, heightFt);
        sendText(heightInches, heightIn);
        sendText(weightField, weight);
        sendText(eyeColorDrp, eyeColor);
        sendText(hairColorDrp, hairColor);

        //navigate to the fourth page
        WebElement page3NxtBtn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[2]/div[1]/button[2]"));
        Thread.sleep(1000);
        click(page3NxtBtn);
        Thread.sleep(500);

        //Fill out the fourth page
        WebElement pInfoQ1No = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[1]/div[2]/label"));
        click(pInfoQ1No);
        WebElement pInfoQ2No = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[2]/div[2]/label"));
        click(pInfoQ2No);
        WebElement pInfoQ3No = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[3]/div[2]/label"));
        click(pInfoQ3No);
        WebElement pInfoQ4Yes = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[4]/div[1]/label"));
        click(pInfoQ4Yes);
        Thread.sleep(1000);
        WebElement incorrectCheck = driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div/div[1]/div[2]/form/div/fieldset[5]/div[4]/label"));
        click(incorrectCheck);
        WebElement nameCheck = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[6]/div[1]"));
        click(nameCheck);
        WebElement aNumberCheck = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/fieldset[6]/div[2]/label"));
        click(aNumberCheck);
        WebElement explanationField = driver.findElement(By.id("explanationForCorrection"));
        sendText(explanationField, "Test data to enter into the explanation field.");
        WebElement receiptIdField = driver.findElement(By.id("previousi131ReceiptNumber"));
        sendText(receiptIdField, "B12345678");


        //Navigate to the Fifth Page
        WebElement page4NxtBtn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[2]/div[1]/button[2]"));
        Thread.sleep(1000);
        click(page4NxtBtn);

        //Upload Hello World
        WebElement uploadHelloWorld = driver.findElement(By.id("file-input-specific"));
        uploadHelloWorld.sendKeys("C:\\Users\\12037\\Downloads\\images.png");

        //Navigate to Review
        WebElement page5NxtBtn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[2]/div[1]/button[2]"));
        Thread.sleep(1000);
        click(page5NxtBtn);

        //Take screenshots of the review
        takeScreenshot("aboutApplicantReview.jpg");
        WebElement abtAppReview = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/div[3]/h3[2]/button"));
        click(abtAppReview);
        WebElement bioInfoReview = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/div[3]/h3[3]/button"));
        click(bioInfoReview);
        Thread.sleep(500);
        takeScreenshot("bioInformationReview.jpg");
        click(bioInfoReview);
        WebElement processInfoReview = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div[2]/form/div/div[3]/h3[4]/button"));
        click(processInfoReview);
        Thread.sleep(500);
        takeScreenshot("processInformatioNReview.jpg");

        //Navigate to Sign and Submit
        WebElement page6NxtBtn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[2]/div[1]/button[2]"));
        Thread.sleep(1000);
        click(page6NxtBtn);

        //Fill out the final page and submit
        String daytimePhone = "555-555-5555";
        WebElement daytimePhoneField = driver.findElement(By.id("daytimePhone"));
        sendText(daytimePhoneField, daytimePhone);
        String signature = "John Smith";
        WebElement sigField = driver.findElement(By.id("signature"));
        sendText(sigField, signature);

        //Submit the Application
        WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[2]/div[1]/button[2]"));
        Thread.sleep(500);
        click(submitBtn);
            }

    @When("The user starts an I131 form")
    public void the_user_starts_an_i131_form() throws InterruptedException {
        //User starts the form
        WebElement startFormBtn = driver.findElement(By.xpath("//*[@id=\"applicant-dashboard-page\"]/div/div[2]/div[2]/ul/li/div/div[3]/a"));
        click(startFormBtn);
        //User selects the appropriate form and clicks "Start"
        WebElement availableFormsDrpDown = driver.findElement(By.id("select-form-type"));
        sendText(availableFormsDrpDown, "I-131");
        WebElement startBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/a"));
        click(startBtn);
    }

    @Then("the user will have successfully completed a new application")
    public void theUserWillHaveSuccessfullyCompletedANewApplication() throws InterruptedException {
        //Take final screenshot for validation
        takeScreenshot("submittedApplication.jpg");

        WebElement successBanner = driver.findElement(By.xpath("//*[@id=\"applicant-dashboard-page\"]/div/div[1]/div[1]/div/div/h4"));
        String successBannerText = successBanner.getText();
        String expectedBannerTest = "You have successfully submitted Form I-131";
        //Assert that the Success Banner is present and take a screenshot
        Assert.assertEquals(expectedBannerTest, successBannerText);
        takeScreenshot("successfulSubmission,jpg");

        //Logout
        WebElement logOutBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/nav/button[2]"));
        //click(logOutBtn);

    }
}


