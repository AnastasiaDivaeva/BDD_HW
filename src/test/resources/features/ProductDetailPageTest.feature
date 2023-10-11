Feature: This feature is responsible for Product Detail Page functionality testing

  Scenario Outline: Verify that product information is present
    Given Guest open Home Page
    When Guest clicks on computer table button
    And Guest  clicks on the link computer table
    And Click on product details section
    Then Guest verifies that characteristic section title contains "<wordToContains>" word

    Examples:
      | wordToContains |
      | Характеристики |