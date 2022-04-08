@login
Feature: To check the login functionality

Background:
  Given user has to be in the login page
@smoke @sanity
Scenario Outline: To check the login functionality with invalid credentials
When user has to enter the "<username>" and enter the "<password>"
And user has to click the login button
Then user cant navigate to the home page

    Examples:
     |username||password|
     |samrylan||Z98EIO|

 @smoke
 Scenario: To check the login functionality without passing credentials
 When user has to click the login button
Then user cant navigate to the home page
  