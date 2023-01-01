Feature: Validate Low Stock Page

  Scenario Outline: Validate Low stock
    Given I am login to the low stock portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard
    And I should click low stock tab
    And I should see the low stock header


    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |