package Units.ImplementedUnits;

import Units.GenericTypes.PhysicalGroundUnit;
import Units.GenericTypes.Zone;

/**
 * Created by George on 12/7/2014.
 *
 * An insane human member of a cult.
 */
public class Cultist extends PhysicalGroundUnit {
    private long health;
    @Override
    public long getHealth() {
        return 2;
    }

    @Override
    public void setHealth(long health) {
        this.health = health;
    }

    @Override
    public long getArmor() {
        return 0;
    }

    @Override
    public void setArmor(long armor) {

    }

    @Override
    public long getShell() {
        return 0;
    }

    @Override
    public void setShell(long shell) {

    }

    @Override
    public void setZoneOfExistence(Zone zoneOfExistence) {

    }

    @Override
    public long getPhysicalAttack() {
        return 1;
    }

    @Override
    public void setPhysicalAttack(long attack) {

    }
}
