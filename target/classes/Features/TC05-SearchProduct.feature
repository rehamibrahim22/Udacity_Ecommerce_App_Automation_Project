@demo_Ecommerce
Feature:user should be able to search on product by Name or SKU

#TestScenario 1 (product name = shirt )
    Scenario: search on product by Name

    Given insert "shirt" in search textbox
    Then click on first item in the result if exist

    #TestScenario 2 (product SKU = AD_C80_RS)
    Scenario: search on product by SKU

        Given insert "AD_C80_RS" in search textbox
        Then click on first item in the result if exist
