##Author lion989821@hotmail.com

Feature: See new services
  Me as a independent
  I want to see new services in servces view
  To verify functioning of the page

  Background: Login in misAliadpos App
    Given "independentA" logs with credentials

  Scenario: See new services
    When goes to the list of services
    Then shoulds see all services on page
