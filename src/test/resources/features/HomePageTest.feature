Feature: This feature is responsible for HomePage functionality testing

  Scenario Outline: Verify that the geolocation can be selected
    Given Guest open Home Page
    When Guest clicks the geolocation button
    And Chooses the city of "<cityName>"
    Then Guest verifies that the city name has become "<cityName>"

    Examples:
      | cityName |
      | Дніпро   |