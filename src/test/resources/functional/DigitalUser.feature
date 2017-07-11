#Sample Feature Definition Template
@tag
Feature: Services

  Background: 
    Given Go to "http://babel.es/en/"
    And Maximize the window
    And Set the implicitly time

  @tag1
  Scenario: Selecting the services navigates to respective page
    Given Keep the mouse on services heading
    When I click on digital user
    Then Verify the Title of digital user page
