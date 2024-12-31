Feature: Happy path of Wikipedia

  @SmokeTest @Task1
  Scenario: Validate My lists, History and Nearby buttons
    Given User scroll to the End of the Home page
    When User clicks on My lists, History and Nearby buttons
    Then User navigate to Home page
    And User scroll to the Beginning of the Home page

  @SystemTest @Task2
  Scenario: Validate Search bar in the Home page
    Given User clicks on Search bar
    When User enters 'New York' on the Search bar
    Then Search bar expanded with search results
    And User click on close search button to clear search
    And  User click on close search button to return to Home page

  @SystemTest @Task3
  Scenario: Validate that user is able to disable all options in Settings
    Given User clicks on Settings in Menu
    When User disable all options in Settings
    Then User click on Navigate up button and return to Home page