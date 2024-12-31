package com.wikipedia.test.executionservice.pages;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static org.openqa.selenium.By.xpath;

import io.appium.java_client.AppiumDriver;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class SettingsPage extends BasePage {
  public SettingsPage(AppiumDriver driver) {
    super(driver);
  }

  final By options =
      xpath("//android.widget.Switch[@resource-id='org.wikipedia.alpha:id/switchWidget']");
  final By navigateUp = accessibilityId("Navigate up");

  public void disableAllOptions() {
    findElements(options).forEach(WebElement::click);
  }

  public void clickNavigateUpBtn() {
    click(navigateUp);

  }
}
