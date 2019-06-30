@Great_British_Chefs

Feature: Great British Chefs


  @Search_and-Login
  Scenario: Search for Lasagna recipes
    Given I am on the Google Homepage
    And I search for Great British Chefs
    And I click Google Search
    And I select Great British Chefs from Search Results
    Then I am on the Great British Chefs Homepage
    When I select the Search Bar
    And I type 'Lasagna' into the Search bar
    And I press Return to submit the search
    And I select sign in
    And I select the email option to sign in
    And I input my username & Password
    And I close the Web browser




