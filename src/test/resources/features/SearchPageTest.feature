Feature: This feature is responsible for Search Page functionality testing

  Scenario Outline:  Verify the search result
    Given Guest open Home Page
    When Guest search product by "<wordToSearch>" word
    Then Guest verifies that Search Result Page title contains "<wordToSearch>" word

    Examples:
      | wordToSearch |
      | iPhone       |
