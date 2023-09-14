@test
Feature: searching using google

  Scenario Outline: user should be able to search on google successfully
    Given user navigate to google
    When user types in google search bar "<data1>"
    And user removes the typed word
    And user types a new word "<data2>"
    And user clicks submit
    Then user verifies that number of results exist on UI
    When user scroll to the bottom of the page
    And user verifies that people also search for is displayed
    And user verifies that the results of people also search for are different from the searched word "<data2>"
    And user verifies that more results button is displayed and clickable
    Examples:
      |data1   |data2|
      |foodics|league of legends|
