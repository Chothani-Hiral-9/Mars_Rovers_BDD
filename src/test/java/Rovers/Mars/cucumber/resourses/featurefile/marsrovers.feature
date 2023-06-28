  # This is a file with '.feature' extension, where we write all out scenarios of
  # application in BDD using Gherkin language

Feature: Mars Rovers
  As a NASA operator, I want to control rovers on Mars.
  so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.

  @Test
  Scenario: Instructions for Mars Rovers.
    Given   the upper-right coordinates of the plateau are "5 5"
    When     the following rover's position and instructions are deployed:
      | Rover Position | Rover Instructions |
      | 1 2 N          | LMLMLMLMM          |
      | 3 3 E          | MMRMMRMRRM         |
    Then    the final positions of the rovers should be:
      | Rover Position | Expected Final Position |
      | 1 2 N          | 1 3 N                   |
      | 3 3 E          | 5 1 E                   |