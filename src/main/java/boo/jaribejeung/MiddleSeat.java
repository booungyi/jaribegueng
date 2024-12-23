package boo.jaribejeung;

import java.util.Collections;
import java.util.List;

public class MiddleSeat {
    List<Integer> middleseat = List.of(5,6,7,8,9,10,11,12);

    public MiddleSeat() {
    }

    public List<Integer> getMiddleseat() {
        Collections.shuffle(middleseat);
        return middleseat;
    }
}
