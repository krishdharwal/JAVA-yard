public class stepsZerio {
    // if number is even divide it with 2 or subtract it with 1

    public static void main(String[] args) {
        int n = 123;
        System.out.println(totalSteps(n));
    }

    private static int totalSteps(int n) {
        if (n == 0){
            return 0;
        }
        if (n % 2 == 0){
            return totalSteps(n / 2) + 1;
        }
        else return totalSteps(n -1) + 1;
    }
}
