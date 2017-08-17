package com.jenkins.qa.pages;

import org.openqa.selenium.By;
import sun.rmi.runtime.Log;

import static com.jenkins.qa.pages.LoginPage.driver;

/**
 * Created by Naveen on 8/16/2017.
 */
public class AdvancedDetailsPage extends LoginPage {
   // private By selectSourceCodeManagement=By.xpath("//class[contains(text(),'Source Code Management')]");
    //*[@id="main-panel"]/div/div/div/div[2]/div[3]/div/div[2]
    private By selectSourceCodeManagement=By.xpath("//*[@id=\"main-panel\"]/div/div/div/div[2]/div[3]/div/div[2]");
    private By githubRadioButton=By.xpath("//input[@id='cb6']");

    public void clickSourceCodeManagement(){
        driver.findElement(selectSourceCodeManagement).click();
    }
    public void tickGitRadioBtn(){
        driver.findElement(githubRadioButton).click();
    }
//a[contains(text(),'Delete Project')]")
}
