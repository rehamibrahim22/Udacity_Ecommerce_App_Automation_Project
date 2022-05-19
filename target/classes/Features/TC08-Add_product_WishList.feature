@demo_Ecommerce
Feature:guest could able to add products to wishlist

#Testscenario1


  Scenario: add products to wishlist

    Given hover on Computers main menu and click on Desktops
    When Add products to WishList
    Then  Success message displayed
    And Confirm quantity of products in the wishlist link in header more than zero

