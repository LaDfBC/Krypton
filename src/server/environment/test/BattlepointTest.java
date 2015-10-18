package server.environment.test;

import server.Units.ImplementedUnits.Cultist;
import server.Units.UnitActions.OffensivePunch;
import server.environment.main.Battlepoint;
import org.junit.Test;

/**
 * Created by George on 2/27/2015
 */

public class GridTest {
    @Test
    public void testNewBattlepointIsEmpty() {
        Battlepoint battlepoint = new Battlepoint(1, 1);
        assert(battlepoint.getSpace(0, 0).getUnits().size() == 0);
    }

    @Test
    public void testUnitMovesToSpace() {
        Battlepoint battlepoint = new Battlepoint(1, 1);
        Cultist cultist = new Cultist(2L);
        battlepoint.getSpace(0, 0).unitMovedToSpace(cultist);
        assert(battlepoint.getSpace(0,0).getUnits().size() == 1);
        assert(battlepoint.getSpace(0,0).getUnits().contains(cultist.getUuid()));
    }

    public static void main(String[] args) {
        Battlepoint battlepoint = new Battlepoint(1, 2);
        Cultist offensiveCultist = new Cultist(2L);
        Cultist dyingCultist = new Cultist(2L);
        battlepoint.getSpace(0, 0).unitMovedToSpace(offensiveCultist);
        battlepoint.getSpace(0, 1).unitMovedToSpace(dyingCultist);
        System.out.println(battlepoint);

        System.out.println(battlepoint.getSpace(0, 0));
        System.out.println(battlepoint.getSpace(0, 1));
        OffensivePunch offensivePunch = new OffensivePunch();
        battlepoint.getSpace(0, 1).unitActedUpon(offensivePunch, dyingCultist.getUuid());
        System.out.println(battlepoint.getSpace(0, 0));
        System.out.println(battlepoint.getSpace(0, 1));
    }
}
