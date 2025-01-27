package questions.concepts;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        System.out.println(diceCombList2("",4,new ArrayList<>()));
    }
    public static void diceComb(String p, int target){
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= target; i++) {
            diceComb(p + i, target - i);

        }
    }

    public static ArrayList<String> diceCombList(String p, int tar)
    {
        if (tar == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= tar; i++) {
            ans.addAll(diceCombList(p + i, tar - i));
        }
        return ans;
    }

    public static ArrayList<String> diceCombList2(String p, int tar,ArrayList<String> list)
    {
        if (tar == 0){
            list.add(p);
            return list;
        }
        for (int i = 1; i <= tar; i++) {
            diceCombList2(p + i, tar - i,list);
        }
        return list;
    }
}
