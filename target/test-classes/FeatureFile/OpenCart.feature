Feature: Test Open Cart Application

  Scenario: Test Register Functionality
    Given open the OpenCart application
    When user enter valid feilds
      | fname | lname | email              | telephone  | password  | cpassword |
      | sanvi | kadam | sanvi192@gmail.com | 7898096545 | abc@sanvi | abc@sanvi |
    When user click on radio button
    When user clcik on the privacy checkbox
    When user clcik on Continue  button
    Then user should able to regester and get valid message

  Scenario: Test Login Functionality
    Given open cart application login page
    When user enter valid credentails
      | sanvi112@gmail.com | abc@sanvi |
    When user click on the login button of login page
    Then user should able to login account page
