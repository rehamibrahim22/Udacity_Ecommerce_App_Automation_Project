@demo_Ecommerce
Feature: user should be able to register on the system


  #Test scenario 1
  Scenario: user Register with valid data

   // Given user open Chrome browser

    Given navigate to Register URL

   When user enter "female" and "Reham" and "Ibrahim" and "5" and "2" and "2016" and "test2@gmail.com" and "123456" and "123456"
    And enter on Register button

    Then user could Register successfully
    And user click on Continue button
