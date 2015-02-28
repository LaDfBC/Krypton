package environment;

import Units.GenericTypes.Unit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by George on 2/23/2015.
 *
 * One area on which a unit could be.
 */
public class Space {
    boolean canOccupy;
    int travelCost;
    List<Unit> groundState = new ArrayList<Unit>();

    private Space(boolean canOccupy, int travelCost) {
        this.canOccupy = canOccupy;
        this.travelCost = travelCost;
    }
    public static class SpaceBuilder {
        boolean canOccupy;
        int travelCost;
        public SpaceBuilder setCanOccupy(boolean canOccupy) {
            this.canOccupy = canOccupy;
            return this;
        }
        public SpaceBuilder setTravelCost(int travelCost) {
            this.travelCost = travelCost;
            return this;
        }

        public Space build() {
            return new Space(canOccupy, travelCost);
        }
    }

    public void unitMovedToSpace(Unit unit) {
        groundState.add(unit);
    }

    public void unitsMovedToSpace(Collection<Unit> units) {
        groundState.addAll(units);
    }

    public List<Unit> getGroundState() {
        return groundState;
    }
}
