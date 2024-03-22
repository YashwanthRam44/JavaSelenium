Feature: In this feature we learn about hooks
  #  @before and @after are global hooks
  # @before and @after hooks will run for each feature file inside "FeatureFile" package
  # let image if they are multiple scenarios inside a feature file
  # Then @before and @after hooks will run for each scenario

  Scenario: This is the first scenario
    Given this is the first given
    Then this is the first then

  Scenario: This is second Scenario
    Given this is second given
    Then This is second then