package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(name="bxu_files[]")
    public WebElement uploadFilesAndImagesBox;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public List<WebElement> filesUploaded;

    @FindBy(xpath="//div[.='Photo:']")
    public WebElement photoText;

    @FindBy(className = "feed-com-files-cont")
    public List<WebElement> imagesUploaded;

    @FindBy(xpath = "//span[.='Insert in text']")
    public List<WebElement> insertInTextButton;

    @FindBy(xpath = "//span[.='In text']")
    public List<WebElement> inTextButton;


    @FindBy(xpath ="//input[@name='BLOG_POST_DISK_ATTACHED_OBJECT_ALLOW_EDIT']")
    public WebElement allowRecipientCheckBox;

    @FindBy(xpath = "//span[@class='del-but']")
    public List<WebElement> delButton;

    @FindBy(xpath = "//span[@class='files-name-edit-btn']")
    public WebElement editFileNameButton;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public WebElement editFileNameBox;

   // @FindBy(xpath ="//input[@class='files-text.files-name-editable']")
    //public WebElement editFileNameBoxEditable;

    //@FindBy(xpath="//input[@class='files-name-edit-inp']")
   // public WebElement fileTitle;









}
