package com.wikipedia.test.executionservice.steps;

import com.wikipedia.test.executionservice.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class HomePageStepDef extends BaseStepDef {
  @Autowired HomePage homepage;

  @Given("User scroll to the End of the Home page")
  public void scrollToTheEndOfTheHomePage() {
    homepage.scrollToEnd();
  }

  @When("User clicks on My lists, History and Nearby buttons")
  public void userClicksOnMyListsHistoryAndNearbyButtons() {
    homepage.clickMyListsBtn();
    waitTill(3);
    homepage.clickHistoryBtn();
    waitTill(3);
    homepage.clickNearbyBtn();
    waitTill(3);
  }

  @Then("User navigate to Home page")
  public void userNavigateToHomePage() {
    homepage.clickExploreBtn();
  }

  @And("User scroll to the Beginning of the Home page")
  public void userScrollToTheBeginningOfTheHomePage() {
    homepage.scrollToBeginning();
  }

  @Given("User clicks on Settings in Menu")
  public void userClicksOnSettingsInMenu() {
    homepage.clickMenuBtn();
    homepage.clickSettingsBtn();
  }
}
