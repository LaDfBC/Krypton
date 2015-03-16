package common;

import Units.GenericTypes.Unit;
import com.sun.xml.internal.ws.util.xml.NodeListIterator;

import java.util.*;

/**
 * Created by George on 3/8/2015.
 */
public class UuidSortedList<U extends Unit> extends ArrayList<U> {
    @Override
    public boolean add(U element) {

        return true;
    }
}
