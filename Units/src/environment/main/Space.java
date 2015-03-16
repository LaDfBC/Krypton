package environment.main;

import Units.GenericTypes.Unit;
import Units.UnitActions.Action;
import Units.UnitActions.Enum.ActionType;

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

    public void unitActedUpon(Unit unit, Action action) {
        if(action.getActionType() == ActionType.OFFENSIVE) {
            Long health = groundState.get(0).takeDamage(action.getActionMagnitude());
            //TODO: eww.  Make state easier to control.  Run through a database?
            groundState.remove(0);
            unit.setCurrentHealth(health);
            groundState.add(unit);
            //Todo: Find and identify the proper unit
//            Long health = unit.takeDamage(action.getActionMagnitude());
            if(health == 0) {
                groundState.remove(0);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Unit unit : groundState) {
            builder.append(unit);
            builder.append("\n");
        }
        return builder.toString();
    }
}
