Feature: I am on the login page
  Scenario: Login success
    Given i am on the login page
    When i enter the following details in the username and password fields
     | name1 | hgtyuj| 
     | name2 |gythfg |
      
    Then I verify the login success

