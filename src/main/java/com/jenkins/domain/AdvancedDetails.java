package com.jenkins.domain;

import com.jenkins.qa.pages.AdvancedDetailsPage;

/**
 * Created by Naveen on 8/16/2017.
 */
public class AdvancedDetails {
    AdvancedDetailsPage advancedDetailsPage= new AdvancedDetailsPage();

    public void addAdvancedPageDetails(){
     advancedDetailsPage.clickSourceCodeManagement();
     advancedDetailsPage.tickGitRadioBtn();

    }
}
