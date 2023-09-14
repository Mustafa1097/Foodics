@test
Feature: searching using google

  Scenario Outline: user should be able to search on google successfully
    Given user navigate to google
    When user types in google search bar
    And user removes the typed word
    And user types a new word
    And user clicks submit
    Then user verifies that number of results exist on UI
    When user scroll to the bottom of the page
    Examples:
      |username   |password|
      |Mustafa0097|123456789|
