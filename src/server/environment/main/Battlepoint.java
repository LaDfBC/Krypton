package server.environment.main;

/**
 * Created by George on 2/23/2015.
 *
 * Essentially a Graph implementation, but with different layers.
 */
public class Battlepoint {
    private Space[][] field;
    private int fieldHeight;
    private int fieldWidth;

    public Battlepoint(int height, int width) {
        fieldHeight = height;
        fieldWidth = width;
        field = new Space[height][width];
        for(int movingHeight = 0; movingHeight < height; movingHeight++) {
            for(int movingWidth = 0; movingWidth < width; movingWidth++) {
                field[movingHeight][movingWidth] = new Space.SpaceBuilder().setCanOccupy(true).setTravelCost(1).build();
            }
        }
    }

    @Override
    public String toString() {
        if(fieldHeight == 0 || fieldWidth == 0) {
           return "++\n++";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("+");
        for(int movingHeight = 0; movingHeight < fieldHeight; movingHeight++) {
            for (int movingWidth = 0; movingWidth < fieldWidth; movingWidth++) {
                builder.append("-+");
            }
            builder.append("\n");
            for (int movingWidth = 0; movingWidth < fieldWidth; movingWidth++) {
                builder.append("|");
                builder.append(" "); //Todo: List real state
            }
            builder.append("|\n+");
        }
        for(int movingHeight = 0; movingHeight < fieldWidth; movingHeight++) {
            builder.append("-+");
        }
        return builder.toString();
    }
}
