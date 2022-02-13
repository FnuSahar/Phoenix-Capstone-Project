@Retail
Feature: Retail Feature
  for this feature you have to have an existing account

  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username ‘userName’ and password 'password’
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @BRegisterAffiliateAcct
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
      | company | website     | taxID | paymentMethod |
      | ABCZ    | www.abc.com | A123B | Ali           |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message for affiliateAcct

  @CEditAffiliateAcct @test
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | USBank   |     12345 |    345677 | sahar       |     123456788 |
    And User click on Continue button
    Then User should see a success message

  @DEditAccount
  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email                  | telephone |
      | sahar     | jan      | student10@yahoo.com |  22222227 |
    And User click on continue button
    Then User should see a message ‘Success: Your account has been successfully updated.’
