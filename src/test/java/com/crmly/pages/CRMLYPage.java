package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLYPage {

    public CRMLYPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Message']")
    public WebElement messageTab;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBody;

    @FindBy(id="bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesButton;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImagesBox;


}
