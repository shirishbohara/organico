package loginPageTest;

import loginPageObject.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    Login login =new Login();

    @BeforeTest
    public  void setup(){
        System.setProperty("webdriver.chrome.driver","F:\\AUTOMATION_PRACTICE\\SeleniumTestAutomation\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://veg-shop.neputertech.com/login");

    }

    @Test
    public void loginWithValidCredentials(){
        login.emailTextField();
        login.passwordField();
        login.submitButton();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
