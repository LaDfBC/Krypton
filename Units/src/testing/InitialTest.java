package testing;

import Units.ImplementedUnits.Cultist;
import environment.Battlepoint;

/**
 * Created by George on 2/27/2015
 */
public class InitialTest {
    public static void main(String[] args) {
        Battlepoint battlepoint = new Battlepoint(3, 5);
        Cultist offensiveCultist = new Cultist();
        Cultist dyingCultist = new Cultist();
//        battlepoint.getSpace(0, 0).unitMovedToSpace(offensiveCultist);
//        battlepoint.getSpace(0, 1).unitMovedToSpace(dyingCultist);
//
//        battlepoint.getSpace(0, 1).getGroundState().get(0).takeDamage(1);
        System.out.printf(battlepoint.toString());
    }
}
