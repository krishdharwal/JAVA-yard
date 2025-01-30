package concepts.subsets_and_Permutaton;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombination {


    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()){
            return new ArrayList<>();
        }
        findCombinations("",digits);
        return list;
    }

    public void findCombinations(String p,String up){
        if (up.isEmpty()){
            list.add(p);
            return;
        }

        int currentDigit = up.charAt(0) - '0';
        int start = (currentDigit - 2) * 3;
        int end = (currentDigit - 1) * 3;

        if (currentDigit == 7 ){
            end++;
        }

        if(currentDigit == 8){
            start++;
            end++;
        }

        if(currentDigit == 9){
            start++;
            end += 2;
        }

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            findCombinations(p + ch,up.substring(1));
        }

    }
    public static void main(String[] args) {
        PhoneNumberCombination p = new PhoneNumberCombination();
        System.out.println(p.letterCombinations("23"));
    }

}
