package Units.GenericTypes;

import common.Coordinates;

/**
 * Created by George on 12/7/2014
 */
public abstract class Unit {
    private Coordinates currentPosition;

    /**
     * Takes the amount of damage specified by subtracting the amount from health.
     *  Returns the amount of health remaining, or 0 if the unit is dead.  Stores 0 as the
     *  unit's health in this case.
     * @param damage
     * @return the unit's health or 0.  Value cannot be negative.
     */
    public long takeDamage(long damage) {
        long health = getTotalHealth();
        health = health - damage;
        if(health > 0L) {
            return health;
        } else {
            setTotalHealth(0L);
            return 0L;
        }
    }

    public abstract void getCurrentHealth();
    public abstract long getArmor();
    public abstract void setArmor(long armor);
    public abstract long getShell();
    public abstract void setShell(long shell);
    public abstract long getTotalHealth();
    public abstract void setTotalHealth(long totalHealth);
    public abstract Zone getZoneOfExistence();
    public abstract void setZoneOfExistence(Zone zoneOfExistence);
    public abstract long getMovementDistance();
    public abstract void setMovementDistance(long distance);

    public Coordinates getCurrentPosition() {
        return currentPosition;
    }
    public void setCurrentPosition(Coordinates position) {
        currentPosition = position;
    }
}
