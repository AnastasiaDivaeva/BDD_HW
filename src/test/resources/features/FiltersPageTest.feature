Feature: This feature is responsible for Filter Page functionality testing

  Scenario Outline: Verify price filter
    Given Guest open Home Page
    When Guest clicks on computer table button
    And Guest set upper price to <upperPrice>
    And Clicks on OK button
    And Get a list of prices
    Then Verify that all prices are less than <upperPrice> value

    Examples:
      | upperPrice |
      | 2000       |

  Scenario Outline: Verify price filter
    Given Guest open Home Page
    When Guest clicks on computer table button
    And Guest set upper price to <upperPrice>
    And Clicks on OK button
    And Get a list of prices
    Then Verify that all prices are less than <upperPrice> value

    Examples:
      | upperPrice |
      | 5000       |

  Scenario Outline: Verify price filter
    Given Guest open Home Page
    When Guest clicks on computer table button
    And Guest set upper price to <upperPrice>
    And Clicks on OK button
    And Get a list of prices
    Then Verify that all prices are less than <upperPrice> value

    Examples:
      | upperPrice |
      | 25000      |