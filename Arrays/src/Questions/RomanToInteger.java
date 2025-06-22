package Questions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public HashMap<Character,Integer> romanMap = new HashMap<>();

    public int romanToInt(String s) {
        createMap();
        int num = romanVal(s.charAt(s.length()-1));
        char[] arr = s.toCharArray();
        int n = arr.length-1;

        for(int i = n-1; i>=0; i--){
            int a = romanVal(arr[i]);
            int b = romanVal(arr[i+1]);

            // increasing = add
            if(a >= b){
                num += a;
            }
            //decreasing = sub
            else{
                num -= a;
            }
        }
        return num;
    }

    public int romanVal(char ch){
        return romanMap.get(ch);
    }

    public void createMap(){
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

    }
}
