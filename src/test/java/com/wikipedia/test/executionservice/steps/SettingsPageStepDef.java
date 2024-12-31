package com.wikipedia.test.executionservice.steps;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.wikipedia.test.executionservice.pages.HomePage;
import com.wikipedia.test.executionservice.pages.SettingsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class SettingsPageStepDef extends BaseStepDef {
  @Autowired HomePage homePage;
  @Autowired SettingsPage settingsPage;

  @When("User disable all options in Settings")
  public void userDisableAllOptionsInSettings() {
    settingsPage.disableAllOptions();
  }

  @Then("User click on Navigate up button and return to Home page")
  public void userClickOnNavigateUpButtonAndReturnToHomePage() {
    settingsPage.clickNavigateUpBtn();
    assertThat(homePage.isWikipediaWordmarkDisplayed(), is(true));
  }
}
