package com.wikipedia.test.executionservice.pages;

import io.appium.java_client.AppiumDriver;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
  protected AppiumDriver driver;
  protected WebDriverWait wait;

  public BasePage(AppiumDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  protected WebElement findElement(By by) {
    return driver.findElement(by);
  }

  protected List<WebElement> findElements(By appiumBy) {
    return driver.findElements(appiumBy);
  }

  protected void click(By by) {
    wait.until(ExpectedConditions.presenceOfElementLocated(by));
    findElement(by).click();
  }

  protected List<String> getTexts(By elements) {
    return findElements(elements).stream().map(WebElement::getText).toList();
  }
}
