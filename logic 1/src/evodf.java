public class evodf {
    public static void main(String[] args) {
        int num = 92834;
        System.out.println(po(num));
    }
    static int po(int num)
    {
        if (num %2 == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}