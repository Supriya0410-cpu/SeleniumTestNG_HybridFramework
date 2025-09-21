Feature: Amazon Tittle of pages

  Background: 
  
   
    Given Amazon application should open
   
    @homepage
  Scenario: Test the Amazon home page
    When User should able to click the amazon home page
    Then user should validate the tittle of home page
    @mxpage @ignore
  Scenario: Test the amazon mxplayer page
    When user should able to click the amazon mxplayer page
    Then user should able to validate amazon tittle of mxplayer page
    @sellpage @ignore
  Scenario: Test the amazon sell page
    When user should able to click the sell page of amazon
    Then user should able to validate tittle of sell page
   
  Scenario: Test the amazon mobile page
    When user should able to click the mobiles page
    Then user should able to validate tittle of mobiles page
