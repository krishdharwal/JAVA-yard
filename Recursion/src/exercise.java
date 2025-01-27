
public class exercise {
    static void print(int i,int s){
        if (i >= 5){
            return;
        }

        print(i+1,s + i);
        System.out.println("up " + i);
        print(i+2,s+i);
        System.out.println("down " + i);
    }

    public static int BinarySearchInRotatedArray(int[] arr ,int tar){
        int s = 0, e =  arr.length-1;
        while (s < e){
            if (arr[s] == tar) return s;
            if (arr[e] == tar) return e;
            s++;
            e--;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearchInRotatedArray(new int[]{4,5,6,1,2,3},6));
    }

}
