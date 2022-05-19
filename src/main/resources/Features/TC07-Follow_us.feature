@demo_Ecommerce
Feature:confirm follow us links open the corresponding websites

  #scenario 1
  Scenario: guest open facebook link in the follow us section and confirm open the correct website in new tab

    Given Click on facebook link in follow us section
    Then confirm URL contain facebook in new tab correctly

    #scenario 2
  Scenario: guest open youtube link in the follow us section and confirm open the correct website in new tab

    Given Click on youtube link in follow us section
    Then confirm URL contain youtube in new tab correctly

     #scenario 3
  Scenario: guest open twitter link in the follow us section and confirm open the correct website in new tab

    Given Click on twitter link in follow us section
    Then confirm URL contain twitter in new tab correctly

    #scenario 4
  Scenario: guest open RSS link in the follow us section and confirm open the correct website

    Given Click on RSS link in follow us section
    Then confirm URL contain RSS

