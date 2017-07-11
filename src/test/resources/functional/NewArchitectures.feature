@tag
Feature: NewArchitecture

  Background: 
    Given Go to "http://babel.es/en/"
    And Maximize the window
    And Set the implicitly time

  @tag1
  Scenario: Selecting the services navigates to respective page
    Given Keep the mouse on services heading
    When I click on new architecture
    Then Verify the Title of new architecture page
