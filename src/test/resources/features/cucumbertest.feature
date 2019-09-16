Feature: General cucumber setup - Dryrun


Scenario: Testing the functionality of scenarios in Feature file

Given running the first step
And running 2nd step
When adding first and second for the third step
Then verify the total is sum of first two



Scenario: Testing web application in chrome Browser
Given Launching  "https://www.heb.com" in "Chrome" browsers



Scenario: Testing web application in safari Browser
Given Launching  "https://www.heb.com" in "safari" browsers

@design
Scenario Outline: Login the application using a set of login credentials
Given Launching  "https://www.heb.com" in "Chrome" browsers
When user logins in the application using <username>,<password>

Examples:
|username|password|
|prodtesting1@gmail.com|Automation@100|
|prodtesting2@gmail.com|Automation@100|


Scenario Outline: Testing on Mobile web application in chrome Browser(Android)
Given Launching  "https://www.heb.com" in "mobilechrome" browsers
When user logins in the application using <username>,<password>

Examples:
|username|password|
|prodtesting1@gmail.com|Automation@100|
|prodtesting2@gmail.com|Automation@100|