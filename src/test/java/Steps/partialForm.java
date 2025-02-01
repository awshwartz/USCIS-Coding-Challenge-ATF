package Steps;

import utils.CommonMethods;
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

public class partialForm extends CommonMethods {
    @When("The user fills out the form partially")
    public void the_user_fills_out_the_form_partially() throws InterruptedException {
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
        click(saveExit3);
        takeScreenshot("SavedApp.jpg");

    }

    @When("the user logs out")
    public void the_user_logs_out() throws InterruptedException {
        WebElement logOutBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/nav/button[2]"));
        click(logOutBtn);
        Thread.sleep(1000);
        takeScreenshot("loggedOut.jpg");
        driver.quit();
    }
}
