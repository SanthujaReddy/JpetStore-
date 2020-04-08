Feature: JPetStore Application Page
This feature verifies the functionality on JPetStore Application

@tc_01_LoginPage
Scenario Outline: Check that JPetStore Application LoginPage is displayed
Given Launch the Chrome browser
When Login JPetStore Page opened 
Then Enter username as "<uname>" and password as"<pass>"
And Clicks the Login button

Examples:
|uname|pass|
|Reddy2407|santhu2407|

@tc_02_ReptilesPage
Scenario: Check that JPetStore Application ReptilePage is displayed
Given Launch the Chrome browser
When Reptiles JPetStore Page opened 
Then Click The Reptile Image
Then Click The ProductID of Reptile
Then Click The ItemId of Reptile
Then Click The AddToCart of Reptile
And Click The ProceedToCheckOut of Reptile

@tc_03_FishPage
Scenario: Check that JPetStore Application FishPage is displayed
Given Launch the Chrome browser
When Fish JPetStore Page opened 
Then Click The Fish Image
Then Click The ProductID of Fish
Then Click The ItemId of Fish
Then Click The AddToCart for Fish
And Click The ProceedToCheckOut for Fish

@tc_04_DogPage
Scenario: Check that JPetStore Application DogPage is displayed
Given Launch the Chrome browser
When Dog JPetStore Page opened 
Then Click The Dog Image
Then Click The ProductID of Dog
Then Click The ItemId of Dog
Then Click The AddToCart for Dog
And Click The ProceedToCheckOut for Dog

@tc_05_ExcelReadPage
Scenario: Check that user can sign in into JPetStore page
Given JPetStore page is opened
Then Login page is opened
Then The <email> and <password> details are given
And login and quit