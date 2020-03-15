package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class interestsPage {

    WebDriver driver;
    By interestSports = By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div/button[5]");
    By save = By.className("button__Button__28xMv");

    public interestsPage(WebDriver driver){
        this.driver = driver;
    }

    public void interestSports(){
        driver.findElement(interestSports).click();
    }

    public void buttonSave(){
        driver.findElement(save).click();
    }

}
