package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysSortFunction {
    public static void main(String[] args) {
        String[] arr = {"1","4","2","5","3"};

        Arrays.sort(arr,(a , b) -> (b + a).compareTo( a + b));
        System.out.println(Arrays.toString(arr));


        arr.toString();
        List<String> l  = new ArrayList<>();
        l.sort((a , b) -> a.compareTo(b + a));
        l.toString();

        StringBuilder sb = new StringBuilder();
        Integer.toString(1234);
    }
}
