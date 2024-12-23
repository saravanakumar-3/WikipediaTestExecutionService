package com.wikipedia.test.executionservice.steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {
  @Autowired AppiumDriver driver;

  @After
  public void after() {
    driver.quit();
  }
}
