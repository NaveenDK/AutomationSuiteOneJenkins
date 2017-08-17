package com.jenkins.domain;

import com.jenkins.qa.pages.LoginPage;

/**
 * Created by Naveen on 8/14/2017.
 */
public class Login
{

     LoginPage login= new LoginPage();

    public void loadHomePage(String url){
        login.loadLoginPage(url);

    }

    public void login(String username, String password){
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();
    }

  //  public void

}
