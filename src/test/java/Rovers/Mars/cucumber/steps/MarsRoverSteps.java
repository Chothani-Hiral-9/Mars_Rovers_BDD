package Rovers.Mars.cucumber.steps;

import Rovers.Mars.MarsRoverController;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is stepDef file with '.java' extension
 * here we implement all our steps defined in feature file.
 */

public class MarsRoverSteps {
    // private instance variables to limit scope within class
    private int plateauX;
    private int plateauY;
    private List<MarsRoverController> rovers;
    private Map<String, String> finalPositions;

    @Given("^the upper-right coordinates of the plateau are \"([^\"]*)\"$")
    public void theUpperRightCoordinatesOfThePlateauAre(String coordinates) {
        String[] plateauCoordinates = coordinates.split(" ");
        plateauX = Integer.parseInt(plateauCoordinates[0]);
        plateauY = Integer.parseInt(plateauCoordinates[1]);
        rovers = new ArrayList<>();
        finalPositions = new HashMap<>();
    }

    @When("^the following rover's position and instructions are deployed:$")
    public void theFollowingRoverSPositionAndInstructionsAreDeployed(DataTable dataTable) {
        List<Map<String, String>> inputRows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : inputRows) {
            String position = row.get("Rover Position");
            String instructions = row.get("Rover Instructions");

            String[] roverCoordinates = position.split(" ");
            int roverX = Integer.parseInt(roverCoordinates[0]);
            int roverY = Integer.parseInt(roverCoordinates[1]);
            char roverDirection = roverCoordinates[2].charAt(0);

            MarsRoverController rover = new MarsRoverController(roverX, roverY, roverDirection);
            rover.explore(instructions);
            rovers.add(rover);
        }
    }

    @Then("^the final positions of the rovers should be:$")
    public void theFinalPositionsOfTheRoversShouldBe(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < rows.size(); i++) {
            MarsRoverController rover = rovers.get(i);
            String position = rows.get(i).get("Rover Position");
            String expectedFinalPosition = rows.get(i).get("Expected Final Position");
            // Print Expected Output in Console ---> 1 3 N and 5 1 E
            System.out.println(expectedFinalPosition);
            // Verify rover gets expected position after following given co-ordinates
            Assert.assertEquals("Unexpected final position for rover " + (i + 1), expectedFinalPosition, rover.getPosition());
        }
    }

}
