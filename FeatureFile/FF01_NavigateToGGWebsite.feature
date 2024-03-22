@Regression
Feature: GG HomePage
  Scenario: Navigate to GG Website
    Given open browser and enter url and navigate to GG Website
    Then get title and assert
 @onlyThisScenario
   Scenario: Login to HomePage
    Given Enter username
    Then Enter password
    And Click on Login Button
    Then should be on Account Screen


     #test

    #one feature file can have multiple Scenarios under it
#Featrue = user story
  #Scenario = test case
      #    #Steps
      #    Given
      #    When
      #    Then
      #    But
      #    AND
      #    *
  # Cucumber Gherkins language