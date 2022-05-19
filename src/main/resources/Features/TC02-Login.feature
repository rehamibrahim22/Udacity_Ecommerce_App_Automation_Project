@demo_Ecommerce
Feature:user should be able to login to the system

#Testscenario1
  Scenario:user login with valid email and password
  //Given user open browser

  Given navigate to login URL
  When enter "test2@gmail.com" and "123456"
  Then user could login successfully
  And user go to home page
  And user click on Log out Link

#Testscenario2


