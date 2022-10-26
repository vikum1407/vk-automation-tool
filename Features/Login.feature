Feature: Login

  Scenario: Successful Login with valid Credentials
    Given User Launch Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page title should be "Dashboard /nopCommerce administration"
    When User click on log out link
    Then Page title should be "Your Store. Login"
    And close browser