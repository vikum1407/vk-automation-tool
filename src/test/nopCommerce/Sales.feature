Feature: Test Sales Functions

  Scenario Outline: Sales order validation
    Given I am in the sales portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard
    And I click the orders tab under catalog
    Then I should see the order title
    And I should select the start date
    And I click select the end date
    #Then I search the productname on below searched table

    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |