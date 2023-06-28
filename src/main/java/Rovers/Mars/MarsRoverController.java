package Rovers.Mars;

/**
 * This is '.java' file
 * here we define actual logic of the code for all the actions we want to perform for a particular test in the application.
 * This file contain all java codes to implement test
 */
public class MarsRoverController {
    // Private variables to limit scope within class
    private int x;
    private int y;
    private char direction;
    // Constructor to initialize instance variables(x, y, and direction)
    public MarsRoverController(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        if (direction == 'N') {
            direction = 'W';
        } else if (direction == 'S') {
            direction = 'E';
        } else if (direction == 'E') {
            direction = 'N';
        } else if (direction == 'W') {
            direction = 'S';
        }
    }

    public void turnRight() {
        if (direction == 'N') {
            direction = 'E';
        } else if (direction == 'S') {
            direction = 'W';
        } else if (direction == 'E') {
            direction = 'S';
        } else if (direction == 'W') {
            direction = 'N';
        }
    }
    // code to move rover forward
    public void moveForward() {
        if (direction == 'N') {
            y++;
        } else if (direction == 'S') {
            y--;
        } else if (direction == 'E') {
            x++;
        } else if (direction == 'W') {
            x--;
        }
    }

    // code to move the rover as per the given coordinates
    public void explore(String instructions) {
        for (int i = 0; i < instructions.length(); i++) {
            char instruction = instructions.charAt(i);
            if (instruction == 'M') {
                moveForward();
            } else if (instruction == 'L') {
                turnLeft();
            } else if (instruction == 'R') {
                turnRight();
            }
        }
    }

    public String getPosition() {
        return x + " " + y + " " + direction;
    }

}
