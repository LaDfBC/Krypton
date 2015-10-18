package server.Units.UnitActions;

import server.Units.UnitActions.Enum.ActionType;

/**
 * Created by George on 12/7/2014
 */
public abstract class Punch extends Action {
    public Punch(ActionType actionType) {
        super(actionType);
    }

    public abstract long getRange();

}
