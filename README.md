# Web Application Test Automation Framework

An automated UI testing framework built with **Java**, **Selenium WebDriver**, and **TestNG** using the **Page Object Model (POM)** architecture.

## 🚀 Key Features
- **Architecture**: Page Object Model (POM) separating page locators, actions, and test scripts.
- **Synchronization**: Dynamic element handling with `WebDriverWait` and explicit waits.
- **Data-Driven**: External test data parameterization for positive, negative, and edge-case execution.
- **Test Management**: TestNG assertions, grouping, XML suite configurations, and parallel execution.
- **Reporting**: Automated screenshot capture listeners on test failure.
- **Build & CI/CD**: Maven build lifecycle configuration and Jenkins pipeline integration ready.

## 🛠 Tech Stack
- **Language**: Java
- **Automation Tool**: Selenium WebDriver
- **Testing Framework**: TestNG
- **Build Tool**: Maven
- **Version Control**: Git / GitHub
- **Defect Tracking**: JIRA

## 📂 Project Structure
```text
src/
├── main/java/com/qa/
│   ├── base/        # TestBase & WebDriver initialization
│   ├── pages/       # Page classes with element locators & methods (POM)
│   └── utils/       # Reusable utilities (WebDriverWait, ScreenshotListener)
└── test/java/com/qa/
    └── tests/       # TestNG test execution scripts# selenium-testng-pom-framework
Web Application Test Automation Framework using Java, Selenium WebDriver, TestNG, and Maven with Page Object Model (POM)
