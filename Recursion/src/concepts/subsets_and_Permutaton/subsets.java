package concepts.subsets_and_Permutaton;

import com.sun.jdi.request.StepRequest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void printAllSequence(String p,String up){
        if (up.isEmpty()){
            System.out.print(p + " - ");
            return;
        }
        printAllSequence(p + up.charAt(0),up.substring(1));
        printAllSequence(p,up.substring(1));
    }


    public static List<String> addAllSeqInList(String p, String up, List<String> list){
        if (up.isEmpty()){
            list.add(p);
            return list;
        }
        addAllSeqInList(p + up.charAt(0),up.substring(1),list);
        addAllSeqInList(p  ,up.substring(1),list);

        return list;
    }

    public static void main(String[] args) {
//        printAllSequence("","abc");
        System.out.println(addAllSeqInList("","abc",new ArrayList<>()));
    }
}
