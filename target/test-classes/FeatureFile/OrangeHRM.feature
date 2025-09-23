Feature: Test OrangeHRM

  Scenario Outline: Test login with DataDriven
    Given Open orange application
    When user enter "<username>" and "<password>"
    When user click on login button of hrm page
    Then for valid user data user should able to dashboard page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | pooja    | test123  |
      | Admin    | admin123 |
      | Abhay    | test123  |
