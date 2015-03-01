package environment;

import Units.GenericTypes.Unit;
import common.Coordinates;

import java.util.List;

/**
 * Created by George on 2/23/2015.
 *
 * Essentially a Graph implementation, but with different layers.
 */
public class Battlepoint {
    private Space[][] field;
    private int fieldHeight;
    private int fieldWidth;

    public Battlepoint(int height, int width) {
        fieldHeight = height;
        fieldWidth = width;
        field = new Space[height][width];
        for(int movingHeight = 0; movingHeight < height; movingHeight++) {
            for(int movingWidth = 0; movingWidth < width; movingWidth++) {
                field[movingHeight][movingWidth] = new Space.SpaceBuilder().setCanOccupy(true).setTravelCost(1).build();
            }
        }
    }

    public Space getSpace(int height, int width) {
        return field[height][width];
    }

    /**
     * Takes a new position and either moves the unit and returns true if the unit
     *  can move their or leaves the unit where it is and returns false if it cannot.
     * @param newPosition - the position the unit is attempting to move towards
     * @return true if the unit can move, false if not
     */
    public boolean move(Unit unit, Coordinates newPosition) {
        Coordinates currentCoordinates = unit.getCurrentPosition();
        //TODO: Check for blockers in the way
        Long unitRange = unit.getMovementDistance();
        if(Math.abs(newPosition.getX() - currentCoordinates.getX()) +
                Math.abs(newPosition.getY() - currentCoordinates.getY()) > unitRange) {
            return false;
        } else {
            unit.setCurrentPosition(newPosition);
            return true;
        }
    }

    @Override
    public String toString() {
        if(fieldHeight == 0 || fieldWidth == 0) {
           return "++\n++";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("+");
        for(int movingHeight = 0; movingHeight < fieldHeight; movingHeight++) {
            for (int movingWidth = 0; movingWidth < fieldWidth; movingWidth++) {
                builder.append("-+");
            }
            builder.append("\n");
            for (int movingWidth = 0; movingWidth < fieldWidth; movingWidth++) {
                builder.append("| ");
            }
            builder.append("|\n+");
        }
        for(int movingHeight = 0; movingHeight < fieldWidth; movingHeight++) {
            builder.append("-+");
        }
        return builder.toString();
    }
}
