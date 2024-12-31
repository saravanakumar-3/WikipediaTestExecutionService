package com.wikipedia.test.executionservice.steps;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.wikipedia.test.executionservice.pages.HomePage;
import com.wikipedia.test.executionservice.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class SearchPageStepDef extends BaseStepDef {
  @Autowired HomePage homepage;
  @Autowired SearchPage searchPage;

  @Given("User clicks on Search bar")
  public void userClicksOnSearchBar() {
    homepage.clickSearchBar();
    assertThat(searchPage.isSearchBarDisplayed(), is(true));
  }

  @When("User enters {string} on the Search bar")
  public void userEntersNewYorkOnTheSearchBar(String searchFor) {
    searchPage.sendKeysToSearchBar(searchFor);
  }

  @Then("Search bar expanded with search results")
  public void searchBarExpandedWithSearchResults() {
    List<String> searchResults = searchPage.getSearchResults();
    assertThat(searchResults.size(), greaterThan(5));
    assertThat(searchResults.get(0), allOf(not(emptyOrNullString())));
  }

  @And("User click on close search button to clear search")
  public void userClickOnCloseSearchButtonToClearSearch() {
    searchPage.clickSearchCloseBtn();
    assertThat(searchPage.getSearchText(), is("Search…"));
  }

  @And("User click on close search button to return to Home page")
  public void userClickOnCloseSearchButtonToReturnToHomePage() {
    searchPage.clickSearchCloseBtn();
    assertThat(homepage.isWikipediaWordmarkDisplayed(), is(true));
  }
}
