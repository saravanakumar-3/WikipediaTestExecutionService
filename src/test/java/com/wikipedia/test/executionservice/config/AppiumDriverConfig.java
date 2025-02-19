package com.wikipedia.test.executionservice.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.spring.ScenarioScope;
import java.net.URL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppiumDriverConfig {
  @Value("${automation.url}")
  URL url;

  @Value("${automation.udid}")
  String udid;

  @Value("${automation.platformVersion}")
  String platformVersion;

  @Bean
  @ScenarioScope
  public AppiumDriver getAppiumDriver() {
    BaseOptions options =
        new BaseOptions()
            .amend("udid", udid)
            .amend("appPackage", "org.wikipedia.alpha")
            .amend("appActivity", "org.wikipedia.main.MainActivity")
            .amend("platformName", "Android")
            .amend("platformVersion", platformVersion)
            .amend("automationName", "uiautomator2");
    return new AndroidDriver(url, options);
  }
}
