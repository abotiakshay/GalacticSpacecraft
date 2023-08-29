import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GalacticSpacecraftTest {
    @Test
    public void testMoveForwardNorth() {
        GalacticSpacecraft spacecraft = new GalacticSpacecraft(0, 0, 0, "N");
        spacecraft.moveForward();
        assertEquals("(0, 1, 0) - N", spacecraft.getPositionAndDirection());
    }
    

    @Test
public void testMoveForwardFromStart() {
    GalacticSpacecraft spacecraft = new GalacticSpacecraft(0, 0, 0, "N");
    spacecraft.moveForward();
    assertEquals("(0, 1, 0) - N", spacecraft.getPositionAndDirection());
}

@Test
public void testInvalidMovementBelowBoundary() {
    GalacticSpacecraft spacecraft = new GalacticSpacecraft(0, 0, 0, "Down");
    spacecraft.moveBackward();
    assertEquals("(0, 0, -1) - Down", spacecraft.getPositionAndDirection());
}


@Test
public void testInvalidMovementAboveBoundary() {
    GalacticSpacecraft spacecraft = new GalacticSpacecraft(0, 0, 100, "Up");
    spacecraft.moveForward();
    assertEquals("(0, 0, 100) - Up", spacecraft.getPositionAndDirection());
}


@Test
public void testBoundaryMovement() {
    GalacticSpacecraft spacecraft = new GalacticSpacecraft(0, 0, 0, "N");
    spacecraft.moveForward();
    spacecraft.moveForward();
    spacecraft.moveBackward();
    assertEquals("(0, 1, 0) - N", spacecraft.getPositionAndDirection());
}

@Test
public void testMoveForwardWithDifferentDirection() {
    GalacticSpacecraft spacecraft = new GalacticSpacecraft(0, 0, 0, "E");
    spacecraft.moveForward();
    assertEquals("(1, 0, 0) - E", spacecraft.getPositionAndDirection());
}


    // Add more test cases for other movement and rotation scenarios
    
    @Test
    public void testExecuteCommands() {
        GalacticSpacecraft spacecraft = new GalacticSpacecraft(0, 0, 0, "N");
        String[] commands = {"f", "r", "u", "b", "l"};
        
        for (String command : commands) {
            spacecraft.executeCommand(command);
        }

        assertEquals("(0, 1, -1) - N", spacecraft.getPositionAndDirection());
    }
}
