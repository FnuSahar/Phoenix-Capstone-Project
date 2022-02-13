@Register
Feature: Register Feature
  we need to create and account for other test
 @Register
  Scenario: Register with Test Enviroment Webpage
  Given User is on Retail website
    And user click on register button
    And user fill registeration form with information below
      | firstname | lastname | email                    | telephone  | password   | confirmPassword |
      | sahar    | sahar     | sahar5@yahoo.com | 0123456789 | sahar | sahar      |
    And user click on agree to terms checkbox
    And user click on continue button for register
   