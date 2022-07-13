package cn.ahogek.vonecthree;

/**
 * This program demonstrates a triangular array
 *
 * @author AhogeK ahogek@gmail.com
 * @since 2022-07-13 12:44:41
 */
public class LotteryArray {

    public static void main(String[] args) {
        final int MAX_LINE = 11;

        // allocate triangular array
        int[][] odds = new int[MAX_LINE][];
        for (int n = 0; n < MAX_LINE; n++)
            odds[n] = new int[n + 1];

        // fill triangular array
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++) {
                /*
                 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                odds[n][k] = lotteryOdds;
            }

        // print triangular array
        for (int[] row : odds) {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}
