package com.jenkins.domain;

import com.jenkins.qa.pages.NewJobSelectionPage;
import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;

/**
 * Created by Naveen on 8/16/2017.
 */
public class NewJobSelection {

    NewJobSelectionPage newJobSelectionPage=new NewJobSelectionPage();

    public void addJobDetails(){
        newJobSelectionPage.enterNameOfItem();
        newJobSelectionPage.clickOnJobType();
        newJobSelectionPage.clickOk();
    }


}
