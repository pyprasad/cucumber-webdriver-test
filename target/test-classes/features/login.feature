#Author: Yugandhar
#Keywords Summary : Sample Webdriver Cucumber project 
#Feature: Verify login on amazon site.
# we can run the test multiple times with correct username and wrong password in first run and second time you can pass wrong username and correct password.
Feature: Login check
  Scenario Outline: Login shouldn't work with incorrect credentials
    Given I am on site home page 
    And I navigated to login page
    When I enter <username> <password> on my account page and continue 
    Then I should see warning message
    
  	Examples: 
      | username          | password |
      | "test@test.com"   | "test123" |
      | "test@test.com"   | "test123" |