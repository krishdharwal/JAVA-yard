package Questions;

import java.util.List;
public class countMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//            type , color , name
        int k = 0;
        if (ruleKey.equals("color")){
            k = 1;
        }
        if (ruleKey.equals("name")){
            k = 2;
        }

        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(k).equals(ruleValue)){
                count++;
            }
        }

        return count;
    }

}
