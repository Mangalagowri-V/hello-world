Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user enter facebook page
    When user enter valid username and password
    Then success message is displayed