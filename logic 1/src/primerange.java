public class primerange {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        System.out.println(pr(start,end));
    }
    static int pr(int st ,int ed){
        int i ,flag = 0;
        for ( i = st; i < ed ; i++) {
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;

                }


            }
            if (flag == 0) {
                System.out.println(i + " ");
            }
            flag = 0;
        }
        return 0;
    }
}
