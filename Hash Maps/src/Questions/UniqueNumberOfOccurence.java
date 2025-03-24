package Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurence {

    public boolean uniqueOccurrences(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int e : arr){
            if(map.containsKey(e)){
                map.compute(e, (k, t) -> t + 1);
            }else{
                map.put(e,1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for(int i : map.values()){
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }
        return true;
    }


}
