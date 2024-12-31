package com.wikipedia.test.executionservice.steps;

import java.time.Duration;
import org.awaitility.Awaitility;

public class BaseStepDef {
  protected static void waitTill(int seconds) {
    Awaitility.await().pollDelay(Duration.ofSeconds(seconds)).until(() -> true);
  }
}
