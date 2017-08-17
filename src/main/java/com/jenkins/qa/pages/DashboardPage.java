package com.jenkins.qa.pages;

import org.openqa.selenium.By;

/**
 * Created by Naveen on 8/14/2017.
 */
public class DashboardPage extends LoginPage {

    private By lnkUsername= By.xpath("//a[@class='model-link inside']");
    private By lnkNewItem= By.xpath("//a[@href='/view/all/newJob']");


    public String getName(){
        String name= driver.findElement(lnkUsername).getText();
        return name;
    }
    public void selectNewItem(){
        driver.findElement(lnkNewItem).click();//dn
    }
}
