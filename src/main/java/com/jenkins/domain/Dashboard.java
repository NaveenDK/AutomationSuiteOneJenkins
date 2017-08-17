package com.jenkins.domain;

import com.jenkins.qa.pages.DashboardPage;

/**
 * Created by Naveen on 8/14/2017.
 */
public class Dashboard {
    //We create an object of the Dashboard Page and uses its methods from the created object
    //so in the test method what we do is we get the
     DashboardPage dashboardPage = new DashboardPage();
     public String getLoggedInUserName(){
     return dashboardPage.getName();
 }
     public void SelectNewItem(){dashboardPage.selectNewItem();}


}
