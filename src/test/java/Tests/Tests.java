package Tests;

import static org.junit.Assert.*;

import Pages.homePage;
import Pages.interestsPage;
import Pages.loginPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    @Test
    public void saveCategories(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrador\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://localhost:3000/");

        homePage home = new homePage(navegador);
        home.clickLogin();

        loginPage login = new loginPage(navegador);
        login.fieldEmail("marioramos18@gmail.com");
        login.fieldPassword("123456");
        login.buttonLogin();

        interestsPage myInterests = new interestsPage(navegador);
        myInterests.interestSports();
        myInterests.buttonSave();

        String articlesports = navegador.findElement(By.className("news-item__Title__28Nfr")).getText();
        assertEquals("For Some Atlanta Hawks, a Revved-Up Game of Uno Is Diversion No. 1", articlesports);



    }

    @Test
    public void navigationCategories(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrador\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://localhost:3000/");

        homePage home = new homePage(navegador);
        home.clickPolitics();

        String politics = navegador.findElement(By.className("news-item__Category__2gbMl")).getText();
        assertEquals("POLITICS", politics);

       navegador.close();

    }

    @Test
    public void loginSucess(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrador\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://localhost:3000/");

        homePage home = new homePage(navegador);
        home.clickLogin();

        loginPage login = new loginPage(navegador);
        login.fieldEmail("marioramos18@gmail.com");
        login.fieldPassword("12345678");
        login.buttonLogin();;

        String welcome = navegador.findElement(By.className("interests__Title__z-Nr1")).getText();
        assertEquals("WELCOME, MARIORAMOS18@GMAIL.COM", welcome);

    }

    @Test
    public void loginFailure(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrador\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://localhost:3000/");

        homePage home = new homePage(navegador);
        home.clickLogin();

        loginPage login = new loginPage(navegador);
        login.fieldEmail("marioramos18@gmail.com");
        login.buttonLogin();;

        String userarea = navegador.findElement(By.className("login__Title__32Vre")).getText();
        assertEquals("USER AREA", userarea);

    }

    @Test
    public void messageNoArticle(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrador\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://localhost:3000/");

        homePage home = new homePage(navegador);
        home.clickBusiness();

        String message = navegador.getPageSource().concat("No articles");
        assertEquals("No articles", message);


    }
}
