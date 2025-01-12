package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;


public class LoginPage extends CommonMethods {
    @FindBy (xpath = "//*[@id=\"header\"]/header/div/nav/button[2]")
    public WebElement LogInButton;

    public  WebElement userName = driver.findElement(By.id("username"));

    @FindBy (id = "password")
    public WebElement passwordField;

    @FindBy (id="kc-login")
    public WebElement signInButton;

    @FindBy (xpath = "//*[@id='kc-registration']/span/a")
    public WebElement registerBtn;
}
