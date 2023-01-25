package collectionAdvance;

import java.util.*;

public class ListNum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 100, 4, 100, 2);

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (Integer i : list) {
            if (!s2.add(i)) {
                s1.add(i);
            }
        }
        System.out.println(s1);
        System.out.println(s2);

        s2.removeAll(s1);
        System.out.println(s2);
    }
}