$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/JPetFeatures/JPet.feature");
formatter.feature({
  "line": 1,
  "name": "JPetStore Application Page",
  "description": "This feature verifies the functionality on JPetStore Application",
  "id": "jpetstore-application-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Check that JPetStore Application LoginPage is displayed",
  "description": "",
  "id": "jpetstore-application-page;check-that-jpetstore-application-loginpage-is-displayed",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_LoginPage"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Login JPetStore Page opened",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter username as \"\u003cuname\u003e\" and password as\"\u003cpass\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Clicks the Login button",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "jpetstore-application-page;check-that-jpetstore-application-loginpage-is-displayed;",
  "rows": [
    {
      "cells": [
        "uname",
        "pass"
      ],
      "line": 12,
      "id": "jpetstore-application-page;check-that-jpetstore-application-loginpage-is-displayed;;1"
    },
    {
      "cells": [
        "Reddy2407",
        "santhu2407"
      ],
      "line": 13,
      "id": "jpetstore-application-page;check-that-jpetstore-application-loginpage-is-displayed;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Check that JPetStore Application LoginPage is displayed",
  "description": "",
  "id": "jpetstore-application-page;check-that-jpetstore-application-loginpage-is-displayed;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_LoginPage"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Login JPetStore Page opened",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter username as \"Reddy2407\" and password as\"santhu2407\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Clicks the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "JPetLoginStep.launch_the_Chrome_browser()"
});
formatter.result({
  "duration": 18531761559,
  "status": "passed"
});
formatter.match({
  "location": "JPetLoginStep.login_JPetStore_Page_opened()"
});
formatter.result({
  "duration": 240421,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reddy2407",
      "offset": 19
    },
    {
      "val": "santhu2407",
      "offset": 46
    }
  ],
  "location": "JPetLoginStep.enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 2641858129,
  "status": "passed"
});
formatter.match({
  "location": "JPetLoginStep.clicks_the_Login_button()"
});
formatter.result({
  "duration": 15136419710,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Check that JPetStore Application ReptilePage is displayed",
  "description": "",
  "id": "jpetstore-application-page;check-that-jpetstore-application-reptilepage-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@tc_02_ReptilesPage"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Reptiles JPetStore Page opened",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Click The Reptile Image",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click The ProductID of Reptile",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Click The ItemId of Reptile",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Click The AddToCart of Reptile",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click The ProceedToCheckOut of Reptile",
  "keyword": "And "
});
formatter.match({
  "location": "JPetLoginStep.launch_the_Chrome_browser()"
});
formatter.result({
  "duration": 12250069817,
  "status": "passed"
});
formatter.match({
  "location": "JPetReptilesStep.reptiles_JPetStore_Page_opened()"
});
formatter.result({
  "duration": 12617834381,
  "status": "passed"
});
formatter.match({
  "location": "JPetReptilesStep.click_The_Reptile_Image()"
});
formatter.result({
  "duration": 4677875062,
  "status": "passed"
});
formatter.match({
  "location": "JPetReptilesStep.click_The_ProductID_of_Reptile()"
});
formatter.result({
  "duration": 3945011820,
  "status": "passed"
});
formatter.match({
  "location": "JPetReptilesStep.click_The_ItemId_of_Reptile()"
});
formatter.result({
  "duration": 5030273222,
  "status": "passed"
});
formatter.match({
  "location": "JPetReptilesStep.click_The_AddToCart_of_Reptile()"
});
formatter.result({
  "duration": 5287965403,
  "status": "passed"
});
formatter.match({
  "location": "JPetReptilesStep.click_The_ProceedToCheckOut_of_Reptile()"
});
formatter.result({
  "duration": 7935696249,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Check that JPetStore Application FishPage is displayed",
  "description": "",
  "id": "jpetstore-application-page;check-that-jpetstore-application-fishpage-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@tc_03_FishPage"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "Launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "Fish JPetStore Page opened",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Click The Fish Image",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Click The ProductID of Fish",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Click The ItemId of Fish",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Click The AddToCart for Fish",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Click The ProceedToCheckOut for Fish",
  "keyword": "And "
});
formatter.match({
  "location": "JPetLoginStep.launch_the_Chrome_browser()"
});
formatter.result({
  "duration": 12202122740,
  "status": "passed"
});
formatter.match({
  "location": "JPetFishStep.fish_JPetStore_Page_opened()"
});
formatter.result({
  "duration": 12242042110,
  "status": "passed"
});
formatter.match({
  "location": "JPetFishStep.click_The_Fish_Image()"
});
formatter.result({
  "duration": 4268080849,
  "status": "passed"
});
formatter.match({
  "location": "JPetFishStep.click_The_ProductID_of_Fish()"
});
formatter.result({
  "duration": 3418659728,
  "status": "passed"
});
formatter.match({
  "location": "JPetFishStep.click_The_ItemId_of_Fish()"
});
formatter.result({
  "duration": 4853786077,
  "status": "passed"
});
formatter.match({
  "location": "JPetFishStep.click_The_AddToCart_for_Fish()"
});
formatter.result({
  "duration": 5062591486,
  "status": "passed"
});
formatter.match({
  "location": "JPetFishStep.click_The_ProceedToCheckOut_for_Fish()"
});
formatter.result({
  "duration": 7303340602,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Check that JPetStore Application DogPage is displayed",
  "description": "",
  "id": "jpetstore-application-page;check-that-jpetstore-application-dogpage-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@tc_04_DogPage"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "Launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "Dog JPetStore Page opened",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Click The Dog Image",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Click The ProductID of Dog",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Click The ItemId of Dog",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Click The AddToCart for Dog",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Click The ProceedToCheckOut for Dog",
  "keyword": "And "
});
formatter.match({
  "location": "JPetLoginStep.launch_the_Chrome_browser()"
});
formatter.result({
  "duration": 12351475326,
  "status": "passed"
});
formatter.match({
  "location": "JPetDogStep.dog_JPetStore_Page_opened()"
});
formatter.result({
  "duration": 9901898078,
  "status": "passed"
});
formatter.match({
  "location": "JPetDogStep.click_The_Dog_Image()"
});
formatter.result({
  "duration": 3930159976,
  "status": "passed"
});
formatter.match({
  "location": "JPetDogStep.click_The_ProductID_of_Dog()"
});
formatter.result({
  "duration": 4157208774,
  "status": "passed"
});
formatter.match({
  "location": "JPetDogStep.click_The_ItemId_of_Dog()"
});
formatter.result({
  "duration": 4567867916,
  "status": "passed"
});
formatter.match({
  "location": "JPetDogStep.click_The_AddToCart_for_Dog()"
});
formatter.result({
  "duration": 3725558264,
  "status": "passed"
});
formatter.match({
  "location": "JPetDogStep.click_The_ProceedToCheckOut_for_Dog()"
});
formatter.result({
  "duration": 7759338110,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Check that user can sign in into JPetStore page",
  "description": "",
  "id": "jpetstore-application-page;check-that-user-can-sign-in-into-jpetstore-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@tc_05_ExcelReadPage"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "JPetStore page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "Login page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "The \u003cemail\u003e and \u003cpassword\u003e details are given",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "login and quit",
  "keyword": "And "
});
formatter.match({
  "location": "JPetEXcelReadStep.jpetstore_page_is_opened()"
});
formatter.result({
  "duration": 12525778161,
  "status": "passed"
});
formatter.match({
  "location": "JPetEXcelReadStep.login_page_is_opened()"
});
formatter.result({
  "duration": 6578585,
  "status": "passed"
});
formatter.match({
  "location": "JPetEXcelReadStep.the_email_and_password_details_are_given()"
});
formatter.result({
  "duration": 12955613055,
  "status": "passed"
});
formatter.match({
  "location": "JPetEXcelReadStep.login_and_quit()"
});
formatter.result({
  "duration": 3330508146,
  "status": "passed"
});
});