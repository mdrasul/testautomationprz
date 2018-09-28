Feature: Multicurt Registration Features
  As a user I can Register to the Website 
  so i can maintain my shopping account 

  Scenario: Positive Registration
    Given I Open My Computer Browser 
    And I Browse to "https://www.demo.iscripts.com/multicart/demo/"
    And I Click Login Link 
    And I CLick SignUp Link
    And I Register with "Sample_User1"
    When I Click CreateAccount Link 
    Then I See "SampleUsername" on the page  
 