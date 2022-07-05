package com.crmly.step_definitions;

import com.crmly.pages.CRMLYPage;
import com.crmly.pages.CRMLY_LoginPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.awt.*;

public class CRMLY_Step_Definitions {

    CRMLY_LoginPage crmlyLoginPage = new CRMLY_LoginPage();
    CRMLYPage crmlyPage = new CRMLYPage();

    @Given("user is on home page and logged in successfully with valid credentials")
    public void user_is_on_home_page_and_logged_in_successfully_with_valid_credentials() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        crmlyLoginPage.login();

    }

    @When("user click message tab and sees message box is open")
    public void user_click_message_tab_and_sees_message_box_is_open() {
        crmlyPage.messageTab.click();
        crmlyPage.messageTab.isDisplayed();

    }

    @When("user click upload files icon and upload files and images box is seen")
    public void user_click_upload_files_icon_and_upload_files_and_images_box_is_seen() {
        crmlyPage.uploadFilesButton.click();
        crmlyPage.uploadFilesAndImagesBox.isDisplayed();
        BrowserUtils.sleep(2000);


    }


    @Then("user should upload at least three files at a time")
    public void userShouldUploadAtLeastThreeFilesAtATime() {
        String path = "C:\\Users\\n\\Desktop\\language\\esl_kids\\clownfacecolored.JPG";
        path = "C:\\Users\\n\\Desktop\\language\\esl_kids\\clownfacecolored.JPG";
        //crmlyPage.uploadFilesAndImagesBox.sendKeys("C:\\Users\\n\\Desktop\\language\\esl kids\\clownfacecolored.JPG");
       // crmlyPage.uploadFilesAndImagesBox.sendKeys(path,Keys.ENTER);
        crmlyPage.uploadFilesAndImagesBox.sendKeys(path);

        //"C:\Users\n\Desktop\language\esl_kids\clownfacecolored.JPG"
        //crmlyPage.uploadFilesAndImagesBox.sendKeys("C:\\Users\\n\\Desktop\\englishworkshop\\OPPOSITES.docx");
        BrowserUtils.sleep(3000);



    }

    @Then("user should see at least three files are uploaded")
    public void userShouldSeeAtLeastThreeFilesAreUploaded() {
        Assert.assertTrue(crmlyPage.filesUploadedOne.isDisplayed());

    }

    @Then("user upload files in different formats and see these files are uploaded")
    public void user_upload_files_in_different_formats_and_see_these_files_are_uploaded() {
        String path = "C:\\Users\\n\\Desktop\\language\\esl_kids\\clownfacecolored.JPG";
        path = "C:/Users/n/Desktop/language/esl_kids/clownfacecolored.JPG";
        //crmlyPage.uploadFilesAndImagesBox.sendKeys("C:\\Users\\n\\Desktop\\language\\esl kids\\clownfacecolored.JPG");
        // crmlyPage.uploadFilesAndImagesBox.sendKeys(path,Keys.ENTER);
        crmlyPage.uploadFilesAndImagesBox.sendKeys("C:\\Users\\n\\Desktop\\englishworkshop\\OPPOSITES.docx");
        BrowserUtils.sleep(3000);
        Assert.assertTrue(crmlyPage.filesUploadedOne.isDisplayed());

    }

    @When("user upload pictures")
    public void user_upload_pictures() {

    }

    @Then("user should see that pictures are uploaded")
    public void user_should_see_that_pictures_are_uploaded() {

    }

    @When("user verify that the uploaded picture itself is seen in Activity Stream when the message is sent.")
    public void user_verify_that_the_uploaded_picture_itself_is_seen_in_activity_stream_when_the_message_is_sent() {

    }

    @Then("user see message is sent and uploaded picture itself is displayed in Activity Stream.")
    public void user_see_message_is_sent_and_uploaded_picture_itself_is_displayed_in_activity_stream() {

    }

    @Then("user click {string} button in order to insert the files and images into the text")
    public void user_click_button_in_order_to_insert_the_files_and_images_into_the_text(String string) {

    }

    @Then("user verify the files and images are inserted into the text")
    public void user_verify_the_files_and_images_are_inserted_into_the_text() {

    }

    @When("user click Allow a recipient to edit documents? check box")
    public void user_click_allow_a_recipient_to_edit_documents_check_box() {

    }

    @Then("user verify that recipient is allowed to edit documents")
    public void user_verify_that_recipient_is_allowed_to_edit_documents() {


    }


    @Then("user verify that user can remove files and images at ant time before sending")
    public void user_verify_that_user_can_remove_files_and_images_at_ant_time_before_sending() {

    }


    @Then("user can rename the file before sending")
    public void user_can_rename_the_file_before_sending() {

    }


}
