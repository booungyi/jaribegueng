package boo.jaribejeung;

import java.util.Collections;
import java.util.List;

public class BackSeat {
    List<Integer> backSeat = List.of(13,14,15,16);

    public BackSeat() {
    }

    public List<Integer> getBackSeat() {
        Collections.shuffle(backSeat);
        return backSeat;
    }
}
