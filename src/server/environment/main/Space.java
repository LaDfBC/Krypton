package server.environment.main;

import server.Units.GenericTypes.Unit;
import server.Units.UnitActions.Action;
import server.Units.UnitActions.Enum.ActionType;

import java.util.*;

/**
 * Created by George on 2/23/2015.
 *
 * One area on which a unit could be.
 */
public class Space {
    boolean canOccupy;
    int travelCost;
    private SortedMap<UUID, Unit> state = new TreeMap<UUID, Unit>();

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
        state.put(unit.getUuid(), unit);
    }

    public void unitsMovedToSpace(Collection<Unit> units) {
        Map<UUID, Unit> unitMap = new TreeMap<UUID, Unit>();
        for(Unit currentUnit : units) {
            unitMap.put(currentUnit.getUuid(), currentUnit);
        }
        state.putAll(unitMap);
    }

    public void unitActedUpon(Action action, UUID targetUnitUuid) {
        if(action.getActionType() == ActionType.OFFENSIVE) {
            Boolean killed = state.get(targetUnitUuid).takeDamage(action.getActionMagnitude());
            if(killed) {
                state.remove(targetUnitUuid);
            }
        }
    }

    public Set<UUID> getUnits() {
        return state.keySet();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Map.Entry unitEntry : state.entrySet()) {
            builder.append(unitEntry.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
