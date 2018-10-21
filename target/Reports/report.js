$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Yugandhar"
    },
    {
      "line": 2,
      "value": "#Keywords Summary : Sample Webdriver Cucumber project"
    },
    {
      "line": 3,
      "value": "#Feature: Verify login on amazon site."
    },
    {
      "line": 4,
      "value": "# we can run the test multiple times with correct username and wrong password in first run and second time you can pass wrong username and correct password."
    }
  ],
  "line": 5,
  "name": "Login check",
  "description": "",
  "id": "login-check",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Login shouldn\u0027t work with incorrect credentials",
  "description": "",
  "id": "login-check;login-shouldn\u0027t-work-with-incorrect-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on site home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigated to login page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \u003cusername\u003e \u003cpassword\u003e on my account page and continue",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see warning message",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-check;login-shouldn\u0027t-work-with-incorrect-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "login-check;login-shouldn\u0027t-work-with-incorrect-credentials;;1"
    },
    {
      "cells": [
        "\"test@test.com\"",
        "\"test123\""
      ],
      "line": 14,
      "id": "login-check;login-shouldn\u0027t-work-with-incorrect-credentials;;2"
    },
    {
      "cells": [
        "\"test@test.com\"",
        "\"test123\""
      ],
      "line": 15,
      "id": "login-check;login-shouldn\u0027t-work-with-incorrect-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Login shouldn\u0027t work with incorrect credentials",
  "description": "",
  "id": "login-check;login-shouldn\u0027t-work-with-incorrect-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on site home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigated to login page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"test@test.com\" \"test123\" on my account page and continue",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see warning message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.navigatingToHomePage()"
});
formatter.result({
  "duration": 14035491959,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.goToLoginPage()"
});
formatter.result({
  "duration": 1375529192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 9
    },
    {
      "val": "test123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefs.enterUserNameAndContinue(String,String)"
});
formatter.result({
  "duration": 2671299620,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.isNotificationShown()"
});
formatter.result({
  "duration": 32047647,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login shouldn\u0027t work with incorrect credentials",
  "description": "",
  "id": "login-check;login-shouldn\u0027t-work-with-incorrect-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on site home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigated to login page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"test@test.com\" \"test123\" on my account page and continue",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see warning message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.navigatingToHomePage()"
});
formatter.result({
  "duration": 13519527698,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.goToLoginPage()"
});
formatter.result({
  "duration": 1560360197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 9
    },
    {
      "val": "test123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefs.enterUserNameAndContinue(String,String)"
});
formatter.result({
  "duration": 1617726913,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.isNotificationShown()"
});
formatter.result({
  "duration": 56148403,
  "status": "passed"
});
});