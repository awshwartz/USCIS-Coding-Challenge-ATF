package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class FormCompletionPage extends CommonMethods {
    WebElement firstNameField = driver.findElement(By.id("persons[0].firstName"));
    WebElement lastNameField = driver.findElement(By.id("persons[0].lastName"));
    WebElement middleNameField = driver.findElement(By.id("persons[0].middleName"));
    WebElement aNumberField = driver.findElement(By.id("aNumber"));
    WebElement countryField = driver.findElement(By.id("countryOfBirth"));
    WebElement nationalityField = driver.findElement(By.id("nationality"));
    WebElement genderDropdown = driver.findElement(By.id("gender"));
    WebElement dobField = driver.findElement(By.id("dateOfBirth"));
    WebElement ssnField = driver.findElement(By.id("ssn"));
    WebElement emailField = driver.findElement(By.id("email_address"));
    WebElement dayPhoneField = driver.findElement(By.id("daytimePhoneNumber"));
    WebElement mobilePhoneField = driver.findElement(By.id("mobilePhoneNumber"));
    WebElement careOfField = driver.findElement(By.id("persons[0].mailingAddressInCareOfName"));
    WebElement streetField = driver.findElement(By.id("persons[0].mailingAddressStreetNumberAndName"));
    WebElement aptCheckBox = driver.findElement(By.id("persons[0].mailingAddressApt"));
    WebElement suiteCheckBox = driver.findElement(By.id("persons[0].mailingAddressSte"));
    WebElement floorCheckBox = driver.findElement(By.id("persons[0].mailingAddressFlr"));
    WebElement addressNumberField = driver.findElement(By.id("persons[0].mailingAddressNumber"));
    WebElement cityField = driver.findElement(By.id("persons[0].mailingAddressCityOrTown"));
    WebElement stateField = driver.findElement(By.id("persons[0].mailingAddressState"));
    WebElement zipField = driver.findElement(By.id("persons[0].mailingAddressZipCode"));
    WebElement ethinicityDropDown = driver.findElement(By.id("biographics.ethnicity"));
    WebElement raceField = driver.findElement(By.id("biographics.race"));
    WebElement heightFeetField = driver.findElement(By.id("biographics.heightFeet"));
    WebElement heightInchesField = driver.findElement(By.id("biographics.heightInches"));
    WebElement weightField = driver.findElement(By.id("biographics.weight"));
    WebElement eyeColorDropdown = driver.findElement(By.id("biographics.eyeColor"));
    WebElement hairColorDropdown = driver.findElement(By.id("biographics.hairColor"));
    WebElement classAdmissionField = driver.findElement(By.id("physicalPresenceInUS.classOfAdmission"));
    WebElement arrivalNumberField = driver.findElement(By.id("physicalPresenceInUS.i94ArrivalOrDepartureNumber"));
    WebElement i94ExpirationField = driver.findElement(By.id("physicalPresenceInUS.i94ExpirationDate"));
    WebElement uspidField = driver.findElement(By.id("physicalPresenceInUS.uspid"));
    WebElement countryReguFiel = driver.findElement(By.id("refugeeTravelDocument.countryOfRefugeeOrAsylee"));
    WebElement travelCheckbox = driver.findElement(By.id("refugeeTravelDocument.travelToCountryOfRefugeeOrAsylee"));
    WebElement countryRefugeeField = driver.findElement(By.id("refugeeTravelDocument.countryOfRefugeeOrAsylee"));
    WebElement returnCountryCheckbox = driver.findElement(By.id("refugeeTravelDocument.everReturnedToCountryOfRefugeeOrAsylee"));
    WebElement saveProgressBtn = driver.findElement(By.xpath("//*[@id=\"form-i131\"]/div/form/div/div[1]/button"));
    WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"form-i131\"]/div/form/div/div[2]/button"));

    public FormCompletionPage(){
        PageFactory.initElements(driver, this);
    }
}
