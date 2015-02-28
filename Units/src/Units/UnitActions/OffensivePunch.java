package Units.UnitActions;

import Units.UnitActions.Enum.ActionType;

/**
 * Created by George on 12/7/2014.
 *
 */
public abstract class OffensivePunch implements Punch {
    public static ActionType getAction() {
        return ActionType.OFFENSIVE;
    }
}
