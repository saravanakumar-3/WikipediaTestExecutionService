package com.wikipedia.test.executionservice.pages;

import io.appium.java_client.AppiumDriver;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.Map;

@Log4j2
@Component
public class HomePage extends BasePage {
  public HomePage(AppiumDriver driver) {
    super(driver);
  }

  public Map<String, Object> getStatus() {
    return driver.getStatus();
  }
}
