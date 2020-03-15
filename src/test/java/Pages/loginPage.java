package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;
    By emailLogin = By.className("login__Input__V0bZq");
    By passwordLogin = By.xpath("//*[@id=\"root\"]/div/main/div/form/input[2]");
    By buttonLogin = By.className("button__Button__28xMv");

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void fieldEmail(String email){
        driver.findElement(emailLogin).sendKeys(email);
    }

    public void fieldPassword(String password){
        driver.findElement(passwordLogin).sendKeys(password);
    }

    public void buttonLogin(){
        driver.findElement(buttonLogin).click();
    }

}
