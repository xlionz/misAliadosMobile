##Author lion989821@hotmail.com

Feature: Quote a service
  Me as independent
  I want to quote a service
  To verify functioning of the page

  Background: Login in misAliadpos
    Given "independentA" logs with credentials
    When goes to the list of services

  Scenario: Quote a service
    When searches the services calling "Cuadros" and quote the service
    Then shoulds see a text indicanting that services was quoted
