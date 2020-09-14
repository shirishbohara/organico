package loginPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

public  void emailTextField(){
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("root@vegshop.com");

}
public void  passwordField(){
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("root");
}

public  void  submitButton(){
    driver.findElement(By.xpath("//button[@type='submit']")).click();
}


}
