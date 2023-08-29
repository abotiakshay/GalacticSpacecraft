public class GalacticSpacecraft {
    private int x;
    private int y;
    private int z;
    private String direction;

    public GalacticSpacecraft(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }


    public void moveForward() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "S":
                y--;
                break;
            case "E":
                x++;
                break;
            case "W":
                x--;
                break;
            case "Up":
                z++;
                break;
            case "Down":
                z--;
                break;
        }
    }


    public void moveBackward() {
        switch (direction) {
            case "N":
                y--;
                break;
            case "S":
                y++;
                break;
            case "E":
                x--;
                break;
            case "W":
                x++;
                break;
            case "Up":
                z--;
                break;
            case "Down":
                z++;
                break;
        }
    }


    
    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    
    public String getPositionAndDirection() {
        return "(" + x + ", " + y + ", " + z + ") - " + direction;
    }

    public static void main(String[] args) {
        GalacticSpacecraft spacecraft = new GalacticSpacecraft(0, 0, 0, "N");
        String[] commands = {"f", "r", "u", "b", "l"};
        
      
 for (String command : commands) {
            switch (command) {
                case "f":
                    spacecraft.moveForward();
                    break;

                     case "b":
                    spacecraft.moveBackward();
                    break;

                      case "l":
                    spacecraft.turnLeft();
                    break;
            }
 }



        System.out.println("Final Position: " + spacecraft.getPositionAndDirection());
    }
}
