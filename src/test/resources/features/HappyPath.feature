Feature: Happy path of Wikipedia

  @SmokeTest @Task1
  Scenario: Validate My lists, History and Nearby buttons
    Given User scroll to the End of the Explore page
    When User clicks on My lists, History and Nearby buttons
    Then User navigate to Explore page
    And User scroll to the Beginning of the Explore page

  @SystemTest @Task2
  Scenario: Validate Search bar in the Explore page
    Given User clicks on Search bar
    When User enters 'New York' on the Search bar
    Then Search bar expanded with search results
    And User click on close search button to clear search
    And  User click on close search button to return to Explore page