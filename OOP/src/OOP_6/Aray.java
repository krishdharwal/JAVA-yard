package OOP_6;

import java.util.Arrays;

public class Aray {
    private int[] arr;
    public static int size = 5;
    public int idx = 0;

    Aray() {
        arr = new int[size];
    }


    public void add(int ele) {
        if (idx == size) {
            int[] temp = new int[size * 5];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[idx++] = ele;
    }

    public void reSet(int i, int ele) {
        arr[i] = ele;
    }

    public int remove(int i) {
        if (i == arr.length - 1) {
            --idx;
        }
        for (int j = i; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
            idx--;
        }
        return idx;
    }

    @Override
    public String toString() {
        return "Aray{" + "arr=" + Arrays.toString(arr) + ", size=" + idx + '}';
    }
}

class caall {
    public static void main(String[] args) {
        Aray arr = new Aray();
        arr.add(1);

        arr.add(1);
        arr.add(33);
        arr.add(333);
        arr.add(1);
        arr.add(33);
        arr.reSet(5,9);
        System.out.println(arr);
    }
}