package boo.jaribejeung;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class jaribeJeung {
    public static void main(String[] args) {
        NameList nameList = new NameList();
        Scanner sc = new Scanner(System.in);
        SeatMethod seatMethod = new SeatMethod();
        Map<Integer,String> map = new HashMap<>();
        while (true) {
            map = (seatMethod.seatmap(sc.nextLine()));
            for (Integer i : map.keySet()) {
                i
            }
        }
    }
}
