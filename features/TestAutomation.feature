Feature: TestAutomation
    This feature is test BDD settings on CucumberStudio

  Scenario Outline: Sample addition
    Given have "<firstNumber>"
    When add "<secondNumber>"
    Then result is "<result>"

    Examples:
      | firstNumber | secondNumber | result |
      | 2 | 3 | 5 |

  Scenario: Sample Subduction
    Given have 9
    When take away 4
    Then result is "5"
