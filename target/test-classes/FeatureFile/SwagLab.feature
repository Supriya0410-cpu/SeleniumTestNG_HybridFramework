Feature: Test SwagLab Login Functionality 

Scenario: Test SwagLab Login Functionalit with valid credentials
Given SwagLab Application should be open using this link "https://www.saucedemo.com/v1/"
When Enter the valid username as "standard_user" and valid password is "secret_sauce"
And User should able to clik login page 
Then User should able to view inventory page 