

Feature: Login Test
  Scenario: user login with valid email and pass
    Given user open login page
    When user enter "valid" "tomsmith" name and "SuperSecretPassword!"
    Then user login successfully

