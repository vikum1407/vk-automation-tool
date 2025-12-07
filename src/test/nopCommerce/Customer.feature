Feature: Test Customer Functions

  Scenario Outline: Customers validation
    Given I am in the customer portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard
    And I click the customers tab under customers
    Then I should see the customers title
    And I should enter the "victoria_victoria@nopCommerce.com" email
    And I should enter fname as "Victoria"
    And I should enter lname as "Terces"
    Then I should click search button


    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |