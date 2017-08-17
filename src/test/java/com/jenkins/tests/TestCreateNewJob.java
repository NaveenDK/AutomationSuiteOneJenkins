package com.jenkins.tests;

import com.jenkins.common.TestDataConstants;
import com.jenkins.domain.Dashboard;
import com.jenkins.domain.Login;
import com.jenkins.domain.NewJobSelection;
import com.jenkins.qa.pages.AdvancedDetailsPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Naveen on 8/16/2017.
 */
public class TestCreateNewJob {
    Login login =new Login();
    Dashboard dashboard= new Dashboard();
    NewJobSelection newJobSelection= new NewJobSelection();
    AdvancedDetailsPage advancedDetailsPage= new AdvancedDetailsPage();

    @BeforeClass
    public void initClass(){
        //login.loadHomePage();
        login.loadHomePage(TestDataConstants.URL);
        login.login(TestDataConstants.USERNAME,TestDataConstants.PASSWORD);

    }
    @Test
    public void CreateNewItem(){
        dashboard.SelectNewItem();
        newJobSelection.addJobDetails();
        advancedDetailsPage.clickSourceCodeManagement();
       // advancedDetailsPage.addAdvancedPageDetails();
    }


}
