package Questions;

public class Richest_customer_wealth {
    public  int maximumWealth(int[][] accounts) {
        int External_sum = 0;
        int Internal_sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                Internal_sum += accounts[i][j];
            }
            if (Internal_sum > External_sum){
                External_sum = Internal_sum;
            }
            Internal_sum = 0;
        }
        return External_sum;
    }
}
