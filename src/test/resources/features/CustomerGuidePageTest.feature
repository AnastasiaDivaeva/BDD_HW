Feature: This feature is responsible for Customer Guide Page functionality testing

  Scenario Outline: Make sure the page opens
    Given Guest open Home Page
    When Click on view all articles button
    Then Guest verifies that they see the title "<expectedTitle>"

    Examples:
      | expectedTitle |
      | Гід покупця   |

  Scenario Outline: Verify the search result
    Given Guest open Home Page
    When Click on view all articles button
    And Guest clicks on search and enters the query "<String input>"
    And Clicks on the section in the prompts
    Then Guest verifies that Customer Guide Page title contains "<String input>" word

    Examples:
      | String input |
      | Монітори     |