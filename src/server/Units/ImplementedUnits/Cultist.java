package server.Units.ImplementedUnits;

import server.Units.GenericTypes.PhysicalGroundUnit;
import server.Units.GenericTypes.Zone;

/**
 * Created by George on 12/7/2014.
 *
 * An insane human member of a cult.
 */
public class Cultist extends PhysicalGroundUnit {
    private Long CULTIST_HEALTH = 2L;
    private String CULTIST_NAME = "Cultist";
    private Long health;

    public Cultist(Long health) {
        super();
        this.health = health;
    }

    @Override
    public Long getTotalHealth() {
        return CULTIST_HEALTH;
    }

    @Override
    public void setCurrentHealth(long totalHealth) {
        health = totalHealth;
    }

    @Override
    public Long getCurrentHealth() {
        return health;
    }

    @Override
    public String getGenericName() {
        return CULTIST_NAME;
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
