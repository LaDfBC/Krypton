package Units.GenericTypes;

/**
 * Created by George on 12/7/2014.
 */
public interface Unit {
    public abstract long getTotalHealth();
    public abstract void setTotalHealth(long totalHealth);
    public abstract void takeDamage(long damage);
    public abstract void getCurrentHealth();
    public abstract long getArmor();
    public abstract void setArmor(long armor);
    public abstract long getShell();
    public abstract void setShell(long shell);
    public abstract Zone getZoneOfExistence();
    public abstract void setZoneOfExistence(Zone zoneOfExistence);
}
