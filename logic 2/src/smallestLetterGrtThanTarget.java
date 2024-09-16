public class smallestLetterGrtThanTarget {
    public static void main(String[] args) {
        char[] arr = {'x','x','y'};
        char tar = 'z' ;
        char ans = findSmGr(arr,tar);
        System.out.println(ans);
    }

    private static char findSmGr(char[] arr,int tar) {
        int s = 0;
        int e = arr.length;

        while(s < e){
           int m = s + (e - s) / 2;

           if(arr[m] > tar) e = m-1;
            else s = m+1;
        }
        return arr[s % arr.length]
                ;
    }
}
