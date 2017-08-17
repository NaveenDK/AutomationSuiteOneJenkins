package com.jenkins.tests;

import com.jenkins.common.TestDataConstants;
import com.jenkins.domain.Dashboard;
import com.jenkins.domain.Login;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Naveen on 8/14/2017.
 */
public class TestLogin {
    Login login =new Login();
    Dashboard dashboard= new Dashboard();

    @BeforeClass
    public void initClass(){
        //login.loadHomePage();
        login.loadHomePage(TestDataConstants.URL);

    }
    @Test
    public void testLogin(){
        login.login(TestDataConstants.USERNAME,TestDataConstants.PASSWORD);
        Assert.assertEquals(dashboard.getLoggedInUserName(),"Naveen Kolambage");
    }

}
