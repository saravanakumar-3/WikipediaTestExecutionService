package com.wikipedia.test.executionservice.pages;

import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfAllElementsLocatedBy;

import io.appium.java_client.AppiumDriver;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class SearchPage extends BasePage {
  public SearchPage(AppiumDriver driver) {
    super(driver);
  }

  final By searchBar = id("search_src_text");
  final By searchResultTitles = id("page_list_item_title");
  final By searchCloseBtn = id("search_close_btn");

  public void sendKeysToSearchBar(String searchFor) {
    findElement(searchBar).sendKeys(searchFor);
  }

  public boolean isSearchBarDisplayed() {
    return findElement(searchBar).isDisplayed();
  }

  public List<String> getSearchResults() {
    wait.until(presenceOfAllElementsLocatedBy(searchResultTitles));
    return getTexts(searchResultTitles);
  }

  public void clickSearchCloseBtn() {
    click(searchCloseBtn);
  }

  public String getSearchText() {
    return findElement(searchBar).getText();
  }
}
