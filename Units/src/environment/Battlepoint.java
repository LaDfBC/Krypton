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

    public Battlepoint(int height, int width) {
        field = new Space[height][width];
        //TODO: Fully initialize with blank spaces
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
}
