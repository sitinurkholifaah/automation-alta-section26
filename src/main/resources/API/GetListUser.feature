Feature: GET list user
  @get_list_user
  Scenario: GET - As admin I have be able to get list user
    Given I set GET api endpoints for list user
    When I send GET HTTP Request list user
    Then I receive valid HTTP response code 200 list user
    And I receive valid data for detail list user