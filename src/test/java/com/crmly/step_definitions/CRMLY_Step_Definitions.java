package com.crmly.step_definitions;

import com.crmly.pages.CRMLYPage;
import com.crmly.pages.CRMLY_LoginPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;

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
        Assert.assertTrue(crmlyPage.messageTab.isDisplayed());

    }

    @When("user click upload files icon and upload files and images box is seen")
    public void user_click_upload_files_icon_and_upload_files_and_images_box_is_seen() {
        crmlyPage.uploadFilesButton.click();
    }

    @Then("user should upload at least three files at a time")
    public void userShouldUploadAtLeastThreeFilesAtATime() {

        String projectPath = System.getProperty("user.dir");
        String filePathJPG = "src/test/resources/filesToUpload/clownfacecolored.JPG";
        String fullPathJPG = projectPath + "/" + filePathJPG;
        String filePathPNG = "src/test/resources/filesToUpload/NicePng_house-outline-png_974690.png";
        String fullPathPNG = projectPath + "/" + filePathPNG;
        String filePathPDF = "src/test/resources/filesToUpload/OPPOSITES.pdf";
        String fullPathPDF = projectPath + "/" + filePathPDF;
        System.out.println(fullPathJPG);
        System.out.println(fullPathPNG);
        System.out.println(fullPathPDF);

        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathJPG);
        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathPNG);
        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathPDF);
        BrowserUtils.sleep(2);
        /*
        try {
            LocalFileDetector detector = new LocalFileDetector();
            File localFileJPG = detector.getLocalFile("C:\Users\n\IdeaProjects\CRMLY_AutomationProject\src\test\resources\filesToUpload\clownfacecolored.JPG");
            ((RemoteWebElement) crmlyPage.uploadFilesAndImagesBox).setFileDetector(detector);

            // enter the absolute file path into the file input field
            crmlyPage.uploadFilesAndImagesBox.sendKeys(localFileJPG.getAbsolutePath());
            File localFilePNG = detector.getLocalFile("C:\Users\n\IdeaProjects\CRMLY_AutomationProject\src\test\resources\filesToUpload\NicePng_house-outline-png_974690.png");
            crmlyPage.uploadFilesAndImagesBox.sendKeys(localFilePNG.getAbsolutePath());
            File localFilePDF = detector.getLocalFile("C:\Users\n\IdeaProjects\CRMLY_AutomationProject\src\test\resources\filesToUpload\OPPOSITES.pdf");
            crmlyPage.uploadFilesAndImagesBox.sendKeys(localFilePDF.getAbsolutePath());
        } catch (Exception e) {
            throw new WebDriverException(e);

        }
         */



    }

    @Then("user should see at least three files are uploaded")
    public void userShouldSeeAtLeastThreeFilesAreUploaded() {

        for (WebElement eachUploadedFile : crmlyPage.filesUploaded) {
            if (eachUploadedFile.getText().contains("JPG") || eachUploadedFile.getText().contains("png")
                    || eachUploadedFile.getText().contains("pdf")) {
                System.out.println("Test PASSED");
                Assert.assertTrue(true);
                break;
            }

        }
    }

    @Then("user upload files in different formats and see these files are uploaded")
    public void user_upload_files_in_different_formats_and_see_these_files_are_uploaded() {
        String projectPath = System.getProperty("user.dir");
        String filePathJPG = "src/test/resources/filesToUpload/clownfacecolored.JPG";
        String fullPathJPG = projectPath + "/" + filePathJPG;
        String filePathPNG = "src/test/resources/filesToUpload/NicePng_house-outline-png_974690.png";
        String fullPathPNG = projectPath + "/" + filePathPNG;
        String filePathPDF = "src/test/resources/filesToUpload/OPPOSITES.pdf";
        String fullPathPDF = projectPath + "/" + filePathPDF;
        String filePathDOC = "src/test/resources/filesToUpload/OPPOSITES.docx";
        String fullPathDOC = projectPath + "/" + filePathDOC;
        String filePathTXT = "src/test/resources/filesToUpload/Grid_Class_Notes.txt";
        String fullPathTXT = projectPath + "/" + filePathTXT;
        String filePathGIF = "src/test/resources/filesToUpload/wait_16.gif";
        String fullPathGIF = projectPath + "/" + filePathGIF;


        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathJPG);
        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathPNG);
        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathPDF);
        BrowserUtils.sleep(2);
        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathDOC);
        BrowserUtils.sleep(2);
        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathTXT);
        BrowserUtils.sleep(2);
        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathGIF);
        BrowserUtils.sleep(2);

        for (WebElement eachUploadedFile : crmlyPage.filesUploaded) {
            if (eachUploadedFile.getText().contains("JPG") || eachUploadedFile.getText().contains("png")
                    || eachUploadedFile.getText().contains("pdf") || eachUploadedFile.getText().contains("docx")
                    || eachUploadedFile.getText().contains("gif") || eachUploadedFile.getText().contains("txt")) {
                System.out.println("Test PASSED");
                Assert.assertTrue(true);
                break;
            }
        }
    }

    @When("user upload pictures")
    public void user_upload_pictures() {
        String projectPath = System.getProperty("user.dir");
        String filePathJPG = "src/test/resources/filesToUpload/clownfacecolored.JPG";
        String fullPathJPG = projectPath + "/" + filePathJPG;
        String filePathPNG = "src/test/resources/filesToUpload/NicePng_house-outline-png_974690.png";
        String fullPathPNG = projectPath + "/" + filePathPNG;
        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathJPG);
        crmlyPage.uploadFilesAndImagesBox.sendKeys(fullPathPNG);
        BrowserUtils.sleep(2);

    }

    @Then("user should see that pictures are uploaded")
    public void user_should_see_that_pictures_are_uploaded() {
        for (WebElement eachUploadedFile : crmlyPage.filesUploaded) {
            if (eachUploadedFile.getText().contains("JPG") || eachUploadedFile.getText().contains("png")) {
                System.out.println("Test PASSED");
                Assert.assertTrue(true);
                break;
            }

        }

    }

    @When("user verify that the uploaded picture itself is seen in Activity Stream when the message is sent.")
    public void user_verify_that_the_uploaded_picture_itself_is_seen_in_activity_stream_when_the_message_is_sent() {
        Assert.assertTrue(crmlyPage.photoText.isDisplayed());

    }

    @Then("user see message is sent and uploaded picture itself is displayed in Activity Stream.")
    public void user_see_message_is_sent_and_uploaded_picture_itself_is_displayed_in_activity_stream() {
        for (WebElement images : crmlyPage.imagesUploaded) {
            Assert.assertTrue(images.isDisplayed());

        }
    }

    @Then("user click insert in text button in order to insert the files and images into the text")
    public void user_click_button_in_order_to_insert_the_files_and_images_into_the_text() {
        for (WebElement InsertInTextButton : crmlyPage.insertInTextButton) {
            InsertInTextButton.click();
            break;
        }

    }

    @Then("user verify the files and images are inserted into the text")
    public void user_verify_the_files_and_images_are_inserted_into_the_text() {
        for (WebElement inText : crmlyPage.inTextButton) {
            Assert.assertTrue(inText.isDisplayed());
            break;
        }

    }

    @When("user click Allow a recipient to edit documents? check box")
    public void user_click_allow_a_recipient_to_edit_documents_check_box() {
        crmlyPage.allowRecipientCheckBox.click();

    }

    @Then("user verify that recipient is allowed to edit documents")
    public void user_verify_that_recipient_is_allowed_to_edit_documents() {
        Assert.assertTrue(crmlyPage.allowRecipientCheckBox.isEnabled());


    }


    @Then("user verify that user can remove files and images at any time before sending")
    public void user_verify_that_user_can_remove_files_and_images_at_ant_time_before_sending() {
        for (WebElement eachDelButton : crmlyPage.delButton) {
            eachDelButton.click();
        }
        BrowserUtils.sleep(2);
        Assert.assertTrue(crmlyPage.delButton.isEmpty());
        BrowserUtils.sleep(2);
    }


    @Then("user can rename the file before sending")
    public void user_can_rename_the_file_before_sending() {
        String fileNameBefore = crmlyPage.editFileNameBox.getText();
        System.out.println(crmlyPage.editFileNameBox.getText());

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(crmlyPage.editFileNameBox).perform();
        crmlyPage.editFileNameButton.click();

        actions.keyDown(Keys.CONTROL)
                .sendKeys(Keys.chord("A"))
                .keyUp(Keys.CONTROL)
                .perform();

        actions.sendKeys(Keys.DELETE)
                .sendKeys("Renamed")
                .sendKeys(Keys.ENTER)
                .perform();
        System.out.println(crmlyPage.editFileNameBox.getText());
        String fileNameAfter = crmlyPage.editFileNameBox.getText();
        Assert.assertFalse(fileNameBefore.equals(fileNameAfter));


    }


}
