package boo.jaribejeung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrontSeat {
    List<Integer> frontlist = List.of(1, 2, 3, 4);

    public FrontSeat() {
    }

    public List<Integer> getFrontlist() {
        Collections.shuffle(frontlist);
        return frontlist;
    }
}