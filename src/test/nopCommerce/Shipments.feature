Feature: Shipments test suite


  Scenario Outline:
    Given I am login to the shipment portal
    When I enter login credentials
    And I click Login button
    Then I should see nopCommerce dashboard
    And I should click shipment tab
    And I should see the shipments header
#    Then I click Brenda Lindgren view button
#    And I should see the Ivoice button
#    Then I should see the full name as "Brenda Lindgren"
#    And I should see the email address as "brenda_lindgren@nopCommerce.com"
#    And I should see the phone number as "14785236"
#    Then I should see the shipping status


    Examples:
      | usertype | LastName    |
      | SP6      | AuxTestLast |