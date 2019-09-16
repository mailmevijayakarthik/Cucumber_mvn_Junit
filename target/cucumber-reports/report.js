$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cucumbertest.feature");
formatter.feature({
  "name": "General cucumber setup - Dryrun",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login the application using a set of login credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@design"
    }
  ]
});
formatter.step({
  "name": "Launching  \"https://www.heb.com\" in \"Chrome\" browsers",
  "keyword": "Given "
});
formatter.step({
  "name": "user logins in the application using \u003cusername\u003e,\u003cpassword\u003e",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "prodtesting1@gmail.com",
        "Automation@100"
      ]
    },
    {
      "cells": [
        "prodtesting2@gmail.com",
        "Automation@100"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login the application using a set of login credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@design"
    }
  ]
});
formatter.step({
  "name": "Launching  \"https://www.heb.com\" in \"Chrome\" browsers",
  "keyword": "Given "
});
formatter.match({
  "location": "MySampleStepdefs.launching_in_browsers(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logins in the application using prodtesting1@gmail.com,Automation@100",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Login the application using a set of login credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@design"
    }
  ]
});
formatter.step({
  "name": "Launching  \"https://www.heb.com\" in \"Chrome\" browsers",
  "keyword": "Given "
});
formatter.match({
  "location": "MySampleStepdefs.launching_in_browsers(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logins in the application using prodtesting2@gmail.com,Automation@100",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});