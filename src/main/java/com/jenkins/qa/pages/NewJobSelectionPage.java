package com.jenkins.qa.pages;

import org.openqa.selenium.By;

import java.util.UUID;

/**
 * Created by Naveen on 8/16/2017.
 */
public class NewJobSelectionPage extends LoginPage
{
    private By itemName=By.xpath("//*[@id=\"name\"]");
    private By jobType=By.xpath("//*[@id=\"j-add-item-type-standalone-projects\"]/ul/li[1]");
    private By ok= By.xpath("//*[@id=\"ok-button\"]");


    public void enterNameOfItem(){     String name=UUID.randomUUID().toString();
        driver.findElement(itemName).sendKeys(name);
    }
    public void clickOnJobType(){
        driver.findElement(jobType).click();
    }
    public void clickOk(){
        driver.findElement(ok).click();
    }


}
