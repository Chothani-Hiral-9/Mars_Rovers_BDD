$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("marsrovers.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# This is a file with \u0027.feature\u0027 extension, where we write all out scenarios of"
    },
    {
      "line": 2,
      "value": "# application in BDD using Gherkin language"
    }
  ],
  "line": 4,
  "name": "Mars Rovers",
  "description": "As a NASA operator, I want to control rovers on Mars.\r\nso that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.",
  "id": "mars-rovers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 9,
  "name": "Instructions for Mars Rovers.",
  "description": "",
  "id": "mars-rovers;instructions-for-mars-rovers.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "the upper-right coordinates of the plateau are \"5 5\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the following rover\u0027s position and instructions are deployed:",
  "rows": [
    {
      "cells": [
        "Rover Position",
        "Rover Instructions"
      ],
      "line": 12
    },
    {
      "cells": [
        "1 2 N",
        "LMLMLMLMM"
      ],
      "line": 13
    },
    {
      "cells": [
        "3 3 E",
        "MMRMMRMRRM"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the final positions of the rovers should be:",
  "rows": [
    {
      "cells": [
        "Rover Position",
        "Expected Final Position"
      ],
      "line": 16
    },
    {
      "cells": [
        "1 2 N",
        "1 3 N"
      ],
      "line": 17
    },
    {
      "cells": [
        "3 3 E",
        "5 1 E"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5 5",
      "offset": 48
    }
  ],
  "location": "MarsRoverSteps.theUpperRightCoordinatesOfThePlateauAre(String)"
});
formatter.result({
  "duration": 206327200,
  "status": "passed"
});
formatter.match({
  "location": "MarsRoverSteps.theFollowingRoverSPositionAndInstructionsAreDeployed(DataTable)"
});
formatter.result({
  "duration": 4480600,
  "status": "passed"
});
formatter.match({
  "location": "MarsRoverSteps.theFinalPositionsOfTheRoversShouldBe(DataTable)"
});
formatter.result({
  "duration": 3661100,
  "status": "passed"
});
});