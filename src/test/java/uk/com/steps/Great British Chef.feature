@Great_British_Chefs
Feature: Great British Chefs

  @Lasagna
  Scenario: Search for Lasagna Recipes
    Given I am on the Great British Chefs Homepage
    When I select the Search Bar
    And I type 'Lasagna' into the Search bar
    And I press Return to submit the search
    When I select the Home icon
    Then I am back on the Home page
    And Web browser closes



