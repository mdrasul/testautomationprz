Feature: Multicurt Login Features
  As a user I can Login to the Website 
  so i can buy and sell product

  Scenario: Positive Login
    Given I Open My Computer Browser 
    And I Browse to "https://www.demo.iscripts.com/multicart/demo/"
    And I Click Login Link 
    And I Enter ID
    And I Enter Password
    When I Click Login Link 
    Then I See "SampleUsername" on the page  
 