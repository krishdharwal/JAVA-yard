package Learning;

import java.util.HashMap;
import java.util.Map;

public class TraverseInMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(4,5);

        // 1.
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 2.
        map.forEach((key, val) -> System.out.println(key + " - " + val));

        // 3.
        for (int i : map.keySet()){
            System.out.println(i);
        }
    }
}
