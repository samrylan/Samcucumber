$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Login.feature");
formatter.feature({
  "name": "To check the login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To check the login functionality with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user has to enter the \"\u003cusername\u003e\" and enter the \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "user cant navigate to the home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ]
    },
    {
      "cells": [
        "samrylan",
        "",
        "Z98EIO"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_has_to_be_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the login functionality with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user has to enter the \"samrylan\" and enter the \"Z98EIO\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_has_to_enter_the_and_enter_the(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cant navigate to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_cant_navigate_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_has_to_be_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the login functionality without passing credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cant navigate to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_cant_navigate_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:Snapdeal.feature");
formatter.feature({
  "name": "To check the search functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "To search the product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be in the snapdeal page",
  "keyword": "Given "
});
formatter.match({
  "location": "Snapdeal.user_has_to_be_in_the_snapdeal_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to search the product1 and product2",
  "rows": [
    {
      "cells": [
        "product1",
        "powerbank"
      ]
    },
    {
      "cells": [
        "product2",
        "earphone"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Snapdeal.user_has_to_search_the_product_and_product(Integer,Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the search the search button",
  "keyword": "When "
});
formatter.match({
  "location": "Snapdeal.user_has_to_click_the_search_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product will appear",
  "keyword": "Then "
});
formatter.match({
  "location": "Snapdeal.product_will_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});