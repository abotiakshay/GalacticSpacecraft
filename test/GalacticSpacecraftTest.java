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
