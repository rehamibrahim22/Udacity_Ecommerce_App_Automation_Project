@demo_Ecommerce
Feature:guest could able to click on two Sliders on Homepage

#Testscenario1
  Scenario: Click on Iphone Slider

    Given click on first slider in home page
    Then confirm the slider redirect to iphone product page


#Testscenario2
  Scenario: Click on Nokia Slider

    Given click on second slider in home page
    Then confirm the slider redirect to nokia page

