package com.wikipedia.test.executionservice.pages;

import static io.appium.java_client.AppiumBy.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import io.appium.java_client.AppiumDriver;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class HomePage extends BasePage {
  public HomePage(AppiumDriver driver) {
    super(driver);
  }

  final By scrollToEnd =
      androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)");
  final By scrollToBeginning =
      androidUIAutomator(
          "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(10)");
  final By myListsBtn = accessibilityId("My lists");
  final By historyBtn = accessibilityId("History");
  final By nearbyBtn = accessibilityId("Nearby");
  final By exploreBtn = accessibilityId("Explore");
  final By searchBarBtn = id("search_container");
  final By wikipediaWordmark = id("single_fragment_toolbar_wordmark");
  final By menuBtn = id("menu_overflow_button");
  final By settingsBtn = id("explore_overflow_settings");

  public void scrollToEnd() {
    wait.until(presenceOfElementLocated(scrollToEnd));
  }

  public void scrollToBeginning() {
    wait.until(presenceOfElementLocated(scrollToBeginning));
  }

  public void clickMyListsBtn() {
    click(myListsBtn);
  }

  public void clickHistoryBtn() {
    click(historyBtn);
  }

  public void clickNearbyBtn() {
    click(nearbyBtn);
  }

  public void clickExploreBtn() {
    click(exploreBtn);
  }

  public void clickSearchBar() {
    click(searchBarBtn);
  }

  public boolean isWikipediaWordmarkDisplayed() {
    try {
      findElement(wikipediaWordmark);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public void clickMenuBtn() {
    click(menuBtn);
  }

  public void clickSettingsBtn() {
    click(settingsBtn);
  }
}
