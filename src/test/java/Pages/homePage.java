package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

    WebDriver driver;
    By login =  By.xpath("//*[@id=\"root\"]/div/header/div/nav/ul/li[6]/a");
    By categoryPolitics = By.xpath("//*[@id=\"root\"]/div/header/div/nav/ul/li[1]/a");
    By categoryBusiness = By.xpath("//*[@id=\"root\"]/div/header/div/nav/ul/li[2]/a");
    //<a href="/business">Business</a>
    // /html/body/div/div/div/div[2]/ul/li[2]/a



    public homePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLogin(){
        driver.findElement(login).click();
    }

    public void clickPolitics(){
        driver.findElement(categoryPolitics).click();
    }

    public void clickBusiness(){
        driver.findElement(categoryBusiness).click();
    }
}
