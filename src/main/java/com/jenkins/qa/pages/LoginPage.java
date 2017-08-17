package com.jenkins.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Naveen on 8/14/2017.
 */
public class LoginPage {

    private By txtUsername =  By.id("j_username");
    private By txtPassword = By.name("j_password");
    private By btnLogin= By.id ("yui-gen1");
    static WebDriver driver;

    public void loadLoginPage(String url){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver= new ChromeDriver();//I just pressed alt+ Enter to make the import class appear above
        //so all the actions taken by implicitly waiting until the browser is loaded
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.navigate().to(url);//we should navigate to the url first

    }

    public void  enterUsername(String username){
        driver.findElement(txtUsername).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(txtPassword).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }
}
