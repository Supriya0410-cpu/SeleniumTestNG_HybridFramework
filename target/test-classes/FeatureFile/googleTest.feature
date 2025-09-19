Feature: This Feature is for the Google Application Test

Background: 
Given Open Google application

Scenario: Google Tittle Validation 
## Given Open Google application 
When user get the current titile of application 
Then tittle should be Google  



Scenario: Test Google Search Box 
## Given Open Google Application 
When user able to enter "java" keyword in search box 
Then appropriate result should open based on search keyword
