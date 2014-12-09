package Units.GenericTypes;

/**
 * Created by George on 12/7/2014.
 */
public interface Unit {
    public abstract long getHealth();
    public abstract void setHealth(long health);
    public abstract long getArmor();
    public abstract void setArmor(long armor);
    public abstract long getShell();
    public abstract void setShell(long shell);
    public abstract Zone getZoneOfExistence();
    public abstract void setZoneOfExistence(Zone zoneOfExistence);
}
