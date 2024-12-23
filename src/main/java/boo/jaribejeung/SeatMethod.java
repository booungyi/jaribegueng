package boo.jaribejeung;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeatMethod {
    public Map<Integer, String> seatmap(String sc) {
        NameList nameList = new NameList();
        Map<Integer,String> map = new HashMap<>();
        FrontSeat frontSeat = new FrontSeat();
        MiddleSeat middleSeat = new MiddleSeat();
        BackSeat backSeat = new BackSeat();
        int i = 0;
        if (sc.equals("앞")) {
            map.put(frontSeat.getFrontlist().get(i),nameList.namelist.get(i));
        } else if (sc.equals("중간")) {
            map.put(middleSeat.getMiddleseat().get(i), nameList.namelist.get(i));
        } else if (sc.equals("뒤")) {
            map.put(backSeat.getBackSeat().get(i), nameList.namelist.get(i));
        }
        return map;
    }
}