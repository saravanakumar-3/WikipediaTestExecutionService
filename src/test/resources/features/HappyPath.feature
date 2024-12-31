Feature: Happy path of Wikipedia

  @SmokeTest @Task1
  Scenario: Validate My lists, History and Nearby buttons
    Given User scroll to the End of the Explore page
    When User clicks on My lists, History and Nearby buttons
    Then User navigate to Explore page
    And User scroll to the Beginning of the Explore page