package basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_and_set {
    public static void main(String[] args) {
        Map<Integer, String> map  = new HashMap<>();
        map.put(1,"krish");
        map.put(2,"baja");

        System.out.println(map);


        Set<Integer> hashset = new HashSet<>();
        hashset.add(22);
        hashset.add(2);
        hashset.add(22);

        System.out.println(hashset);
    }
}
