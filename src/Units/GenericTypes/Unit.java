package Units.GenericTypes;

import com.sun.javafx.beans.annotations.NonNull;
import common.Coordinates;

import java.util.UUID;

/**
 * Created by George on 12/7/2014
 */
public abstract class Unit {
    private Coordinates currentPosition;
    private UUID uuid;

    protected Unit() {
        uuid = UUID.randomUUID();
    }

    /**
     * Takes the amount of damage specified by subtracting the amount from health.
     *  Returns the amount of health remaining, or 0 if the unit is dead.  Stores 0 as the
     *  unit's health in this case.
     * @param damage - the amount of offensive power to be dealt to this unit.
     * @return the unit's health or 0.  Value cannot be negative.
     */
    public Boolean takeDamage(@NonNull Long damage) {
        long health = getTotalHealth();
        health = health - damage;
        setCurrentHealth(health);
        return health > 0L;
    }

    public UUID getUuid() {
        return uuid;
    }
    public abstract Long getCurrentHealth();
    public abstract String getGenericName(); //The name of the unit.  E.g., "Warrior"
    public abstract long getArmor();
    public abstract void setArmor(long armor);
    public abstract long getShell();
    public abstract void setShell(long shell);
    public abstract Long getTotalHealth();
    public abstract void setCurrentHealth(long totalHealth);
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(getGenericName());
        builder.append("Health: ").append(getCurrentHealth()).append("/").append(getTotalHealth());

        return builder.toString();
    }
}
