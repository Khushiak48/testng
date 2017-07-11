@tag
Feature: BusinessAnalytics
  I want to use this template for my feature file

  Background: 
    Given Go to "http://babel.es/en/"
    And Maximize the window
    And Set the implicitly time

  @tag1
  Scenario: Selecting the services navigates to respective page
    Given Keep the mouse on services heading
    When I click on business analytics
    Then Verify the Title of business page
