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

    public long getHealth() {
        return 2;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    @Override
    public long getTotalHealth() {
        return 0;
    }

    @Override
    public void setTotalHealth(long totalHealth) {

    }

    @Override
    public void getCurrentHealth() {

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
    public long getMovementDistance() {
        return 1;
    }

    @Override
    public void setMovementDistance(long distance) {

    }

    @Override
    public long getPhysicalAttack() {
        return 1;
    }

    @Override
    public void setPhysicalAttack(long attack) {

    }
}
