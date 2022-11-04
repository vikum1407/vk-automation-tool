Feature: Login page automation

  @nopCom
  Scenario Outline: validate nopCommerce websites
    Given I am in nopCommerce login page
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard
    And I should see the nopCommerce logo

    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |
