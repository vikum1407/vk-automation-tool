Feature: Test All catalogs

  @nopCom
  Scenario Outline: Test Products Catalog
    Given I am in the product portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard
    And I click the products tab under catalog
    Then I should see the products title
    And I should pass product name
    Then I click search button
    Then I search the productname on below searched table

    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |

  @nopCom
  Scenario Outline: Test Products categories
    Given I am in the product portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard
    And I click the categories tab under catalog
    Then I should see the Categories title
    Then I should see the Add new button
    And I should see the Export button
    And I should see the Import button
    And I should see the Delete button
    And I should pass category name
    Then I click search button on category ui
    Then I search the catagoryname on below searched table

    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |

  Scenario Outline: Test Products Manufactures
    Given I am in the product portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard

    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |


  Scenario Outline: Test Products catalog Reviews
    Given I am in the product portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard

    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |


  Scenario Outline: Test Products tags
    Given I am in the product portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard

    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |