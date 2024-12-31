# WikipediaTestExecutionService
**Automation framework for testing Wikipedia Android application**

### Built With:

- Spring Boot
- Selenium
- Cucumber

### Prerequisites:
- Java 17
- Maven

### How to Run:
**Below are the command with different options:**
- To just run all test - "mvn clean test"
- To run only SmokeTests - mvn clean test -D"cucumber.filter.tags=@SmokeTest"