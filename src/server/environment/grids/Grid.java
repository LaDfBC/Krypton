package server.environment.grids;

import java.lang.reflect.Array;

/**
 * Created by George on 8/23/2015
 *
 * A grid that stores an object of type T on each of its Spaces.  Each Space
 *  represents a certain set of coordinates in an X-Y grid.  They could
 *  store anything from integer values for elevation to server.Units.
 */
public class Grid<T> {
    private T[][] grid;
    private Integer sizeOfX;
    private Integer sizeOfY;
    Grid(Class<T> clazz, Integer x, Integer y) {
        //Oh god, the generic logic
        @SuppressWarnings("unchecked")
        final T[][] tempGrid = (T[][]) Array.newInstance(clazz, x, y);
        this.grid = tempGrid;
        this.sizeOfX = x;
        this.sizeOfY = y;
    }

    //Returns null if nothing at this location
    public T getObjectAt(Integer x, Integer y) {
        return grid[x][y];
    }

    public boolean objectExistsAt(Integer x, Integer y) {
        return getObjectAt(x, y) != null;
    }

    public void putObjectAt(Integer x, Integer y, T objectToAdd) {
        grid[x][y] = objectToAdd;
    }

    public Integer getSizeOfX() {
        return sizeOfX;
    }
    public Integer getSizeOfY() {
        return sizeOfY;
    }
}
