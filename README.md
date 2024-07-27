<h2><b>Java BDD Framework</b></h2>

Welcome to the Java BDD Framework project! This repository contains a Java-based Behavior-Driven Development (BDD) framework designed to help automate test cases. The project leverages Maven for dependency management and JUnit for executing tests. The framework separates concerns effectively by organizing test data, locators, and utility functions into distinct files.
**Project Structure**

**Directory Overview**

    **src/**
        test/java/
            pages/: Contains Page Object Model (POM) classes representing different pages of the application.
            stepDefinitions/: Contains step definition classes that link feature files to the automation code.
        test/java/
            utils/: Contains utility classes for fetching data and locators from property files.

    <i><b>resources/</b></i>
        properties/: Contains properties files with test data and locators used by the framework.
        feature/: Contains Gherkin feature files outlining application features and scenarios.

    reports/: Generated test execution reports.

    pom.xml: Maven configuration file managing project dependencies and build configurations.

Getting Started
**Prerequisites**

    Java 8 or higher
    Maven 3.x
    JUnit 4.x or 5.x

**Installation**

    Clone the Repository

    sh

git clone https://github.com/your-username/java-bdd-framework.git
cd java-bdd-framework

**Build the Project**

Use Maven to build the project and install dependencies:

sh

    <b>mvn clean install</b>

**Configuration**

    Test Data and Locators

    The resources/properties folder contains properties files for test data and locators. Ensure these files are correctly configured with necessary information for your application.

    **Feature Files**

    Feature files are located in <i><b>src/java/test/feature.</b></i> You can add or modify feature files to reflect the scenarios you want to test.

    **Page Object Model**

    Add or modify POM classes in <i><b>src/test/java/pages</b></i> to interact with different parts of your application.

    **Step Definitions**

    Update or add step definitions in <i><b>src/test/java/stepDefinitions</b></i> to map steps from feature files to automation code.

**Running Tests**

The test execution is managed by the TestRunner class, which is configured to run with JUnit. To execute the tests:

sh

mvn test

**Reports**

Test execution results are stored in the reports directory. You can review the generated reports to analyze test results.
Utility Classes

Utility classes are located in src/test/java/utils and are used for fetching data and locators from the respective property files.
