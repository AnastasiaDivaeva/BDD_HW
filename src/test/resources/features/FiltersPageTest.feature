Feature: This feature is responsible for Filter Page functionality testing

  Scenario Outline: Verify products' prices do not exceed upper price bound defined by filter
    Given Guest open Home Page
    When Guest clicks on computer table button
    And Guest set upper price to <upperPrice>
    And Clicks on OK button
    And Get a list of prices
    Then Verify that all prices are less than <upperPrice> value

    Examples:
      | upperPrice |
      | 2000       |
      | 5000       |
      | 25000      |