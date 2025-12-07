Feature: Dashboard Feature Test

  @nopCom
  Scenario Outline: Test Victoria status on the order table
    Given I am in the Dashboard portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard
    And I should see the Victoria customer
    And I should see the Complete status on Victoria customer
    Then I click view button
    And I should see the Ivoice button


    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |


  @nopCom
  Scenario Outline: Test Brenda Lindgren status on the order table
    Given I am in the Dashboard portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard
    And I should see the Brenda Lindgren customer
    And I should see the Complete status on Brenda Lindgren customer
    Then I click Brenda Lindgren view button
    And I should see the Ivoice button
    Then I should see the full name as "Brenda Lindgren"
    And I should see the email address as "brenda_lindgren@nopCommerce.com"
    And I should see the phone number as "14785236"
    Then I should see the shipping status


    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |

  @nopCom
  Scenario Outline: Test James Pan status on the order table and the shipment check
    Given I am in the Dashboard portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard
    And I should see the Brenda Lindgren customer
    And I should see the Complete status on Brenda Lindgren customer
    Then I click James Pan view button
    And I should see the Ivoice button
    Then I should see the full name for james as "James Pan"
    And I should see the email address for james as "james_pan@nopCommerce.com"
    And I should see the phone number for james as "369258147"
    Then I should click the product details to donation
    Then I should see the Edit Production details ui
    And I should see the setting button


    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |
