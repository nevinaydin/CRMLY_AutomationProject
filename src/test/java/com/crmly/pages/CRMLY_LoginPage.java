package com.crmly.pages;

import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLY_LoginPage {
    public CRMLY_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;


    public void login(){
        this.inputUserName.sendKeys("helpdesk1@cybertekschool.com");
        this.inputPassword.sendKeys("UserUser");
        this.loginButton.click();
    }

    public void login(String username, String password){
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    /**
     * This method will log in using credentials from
     * configuration.properties
     */
    public void loginWithConfig(){
        inputUserName.sendKeys(ConfigurationReader.getProperty("username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

}
