Feature: Create an Account
  Scenario Outline: Create an account with valid data
    Given open browser and enter url and navigate to GG Website
    Then enter data "<FirstName>","<LastName>","<EmailAddress>"
    Examples:
    |FirstName|LastName|EmailAddress|
    |FirstName01|LastName01|EmailAddress01@gmail.com|
    |FirstName02|LastName02|EmailAddress02@gmail.com|
    |FirstName03|LastName03|EmailAddress03@gmail.com|