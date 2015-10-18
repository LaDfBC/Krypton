package server.Units.UnitActions;

import server.Units.UnitActions.Enum.ActionType;

/**
 * Created by George on 3/1/2015
 */
public abstract class Action {
    ActionType actionType;

    public Action(ActionType actionType) {
        this.actionType = actionType;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public abstract Long getActionMagnitude();
}
