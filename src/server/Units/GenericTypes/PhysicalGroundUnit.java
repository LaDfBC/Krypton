package server.Units.GenericTypes;

/**
 * Created by George on 12/7/2014.
 *
 * Represents a unit that attacks from the ground with a purely physical weapon.
 */
public abstract class PhysicalGroundUnit extends Unit {
    protected long physicalAttack;

    public abstract long getPhysicalAttack();
    public abstract void setPhysicalAttack(long attack);

    @Override
    public Zone getZoneOfExistence() {
        return Zone.GROUND;
    }
}
