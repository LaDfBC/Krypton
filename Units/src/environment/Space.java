package environment;

/**
 * Created by George on 2/23/2015.
 *
 * One area on which a unit could be.
 */
public class Space {
    private Space(boolean canOccupy, int travelCost) {
        this.canOccupy = canOccupy;
        this.travelCost = travelCost;
    }

    boolean canOccupy;
    int travelCost;

    public static class SpaceBuilder {
        boolean canOccupy;
        int travelCost;
        public SpaceBuilder setCanOccupy(boolean canOccupy) {
            this.canOccupy = canOccupy;
            return this;
        }
        public SpaceBuilder setTravelCost(int travelCost) {
            this.travelCost = travelCost;
            return this;
        }

        public Space build() {
            return new Space(canOccupy, travelCost);
        }
    }

}
