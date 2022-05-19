@demo_Ecommerce
Feature:guest could able to add products to shopping cart

#Testscenario1

  Scenario: add products to shopping cart

Given hover on Computers main menu and click on Desktops
    When Add products to shopping cart
    Then Add to cart confirmation message displayed
    And get quantity of products in shopping cart link in header
