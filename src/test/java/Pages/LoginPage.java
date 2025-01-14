package Pages;

import com.mysql.cj.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.ConfigReader;


public class LoginPage extends CommonMethods {

    public WebElement login = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div[2]/button"));
    public WebElement usernameField = driver.findElement(By.id("username"));

    public WebElement passwordField = driver.findElement(By.id("password"));

    public WebElement loginBtn = driver.findElement(By.id("kc-login"));


    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}
