
@tag
Feature: Login from HomePage Feature
  
  @tag1
  Scenario: Login from HomePage Feature
    Given I am in the Luma HomePage
    And I verify the homepage url
    When I click on Sign In link
    And I enter the email as "jubiee@gmail.com" and password as "Itsraining123##"
    And click on the SignIn button
    Then I will be logged into the application and I verify the Welcome message
    

  
