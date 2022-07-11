@REM-1376
Feature: CRMLY  file upload as message functionality
  As a user, I should be able to upload files and pictures as messages

  Background:
    Given user is on home page and logged in successfully with valid credentials
    When user click message tab and sees message box is open
    And user click upload files icon and upload files and images box is seen

@REM-1367 @wip
  Scenario:  User should be able to upload multiple files at the same time (Test with max 3 files.).
    When user should upload at least three files at a time
    Then user should see at least three files are uploaded

@REM-1369
  Scenario: User should be able to upload files in different formats

    Then user upload files in different formats and see these files are uploaded

@REM-1370
  Scenario: User should be able to upload pictures

    And user upload pictures
    Then user should see that pictures are uploaded

@REM-1371
  Scenario: User should be able to display the uploaded picture itself in Activity Stream.

    And user verify that the uploaded picture itself is seen in Activity Stream when the message is sent.
    Then user see message is sent and uploaded picture itself is displayed in Activity Stream.

@REM-1372
  Scenario:  User should be able to insert the files and images into the text

    And user upload files in different formats and see these files are uploaded
    Then user click insert in text button in order to insert the files and images into the text
    Then user verify the files and images are inserted into the text

@REM-1373
  Scenario: User should be able to allow a recipient to edit documents.

    And user upload files in different formats and see these files are uploaded
    And user click Allow a recipient to edit documents? check box
    Then user verify that recipient is allowed to edit documents

@REM-1374
  Scenario: User should be able to remove files and images at any time before sending.

    And user upload files in different formats and see these files are uploaded
    Then user verify that user can remove files and images at any time before sending

@REM-1375
  Scenario:  User should be able to rename the file before sending it.

    And user upload files in different formats and see these files are uploaded
    Then user can rename the file before sending
