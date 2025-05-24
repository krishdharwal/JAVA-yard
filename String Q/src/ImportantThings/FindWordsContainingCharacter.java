package ImportantThings;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){

            if(words[i].indexOf(x) != -1){
                list.add(i);
            }

        }
        return list;
    }
}

// instead of words[i].contains(String.valueOf(x)) use words[i].indexOf(x) != -1
// indexOf returns the first occurrence of the target and -1 if not found