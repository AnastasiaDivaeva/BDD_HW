Feature: This feature is responsible for Shop Page functionality testing

  Scenario: Verify adding product to the cart
    Given Guest open Home Page
    When Guest clicks on computer table button
    And Guest  clicks on the link computer table
    And Click on the buy product button
    And Guest goes to a new page and clicks the buy button
    Then Guest verifies that the order confirmation button is displayed

