package com.wikipedia.test.executionservice.steps;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import com.wikipedia.test.executionservice.pages.HomePage;
import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class HomePageStepDef {
  @Autowired HomePage homepage;

  @Given("User navigates to Home page")
  public void navigateToHomePage() {
    assertThat(homepage.getStatus(), notNullValue());
  }
}
