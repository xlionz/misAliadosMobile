##Author lion989821@hotmail.com

Feature: Accept a request of service
  Me as a independent
  I want to accept a request of service
  To verify functioning of the page

  Background: Login in misAliadpos App and search the service
    Given "independentA" logs with credentials
    When goes to the list of services

  Scenario: Accept a request of services
    When searches the services calling "Cuadros" and accept the request
    Then shoulds se a text indicanting that request was accepted