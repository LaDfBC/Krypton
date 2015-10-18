package server.Units.UnitActions;

import server.Units.UnitActions.Enum.ActionType;

/**
 * Created by George on 12/7/2014.
 *
 */
public class OffensivePunch extends Punch {

    public OffensivePunch() {
        super(ActionType.OFFENSIVE);
    }

    public static ActionType getAction() {
        return ActionType.OFFENSIVE;
    }

    @Override
    public long getRange() {
        return 1L;
    }

    @Override
    public Long getActionMagnitude() {
        return 1L;
    }
}
