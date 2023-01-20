##Author lion989821@hotmail.com

  Feature: Login mis aliados App
    Me as independent
    i want to login in mis aliados
    to verify functioning of the page

  Scenario: Login mis aliados App
    Given "independentA" logs with credentials
    When goes to the profile to see the license
    Then shoulds see the name in the profile page