package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static utils.CommonMethods.*;

public class TestCase {
    public static void main(String[] args) throws InterruptedException {
        /*System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //openBrowserAndLaunchApplication();
        driver.get("https://rapid02-keycloak.inadevus.com/auth/realms/ceebit/protocol/openid-connect/auth?client_id=uscis-rapid-mc2-ui-e2e-testing&redirect_uri=https%3A%2F%2Frapid02-uscis-rapid-mc2-ui-e2e-testing.inadevus.com%2F&state=7ffba3c0-8092-41c5-b2c3-77d8d07b2b18&response_mode=fragment&response_type=code&scope=openid&nonce=ad868695-9559-41d2-8896-f5e71e0c5515&code_challenge=PwCXMUaHbwWfkWbKKDjWfBrHMoyGXAC6vPuFp2424xU&code_challenge_method=S256");
        WebElement userNameField = driver.findElement(By.id("username"));
        sendText(userNameField, "test");*/
        openBrowserAndLaunchApplication();
        WebElement login = driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/nav/button[2]"));
        click(login);
    }

}
