package cn.ahogek.vonecthree;

/**
 * This program shows how to show store tabular data in a 2D array
 *
 * @author AhogeK ahogek@gmail.com
 * @since 2022-07-13 00:20:55
 */
public class CompoundInterest {

    public static void main(String[] args) {
        final double START_RATE = 10;
        final int COL_RATES = 6;
        final int LINE_YEARS = 10;

        // set interest rates to 10 . . . 15%
        double[] interestRate = new double[COL_RATES];
        for (int i = 0; i < interestRate.length; i++)
            interestRate[i] = (START_RATE + i) / 100.0;

        double[][] balances = new double[LINE_YEARS][COL_RATES];

        // set initial balances to 10000
        for (int j = 0; j < COL_RATES; j++)
            balances[0][j] = 10000;

        // compute interest in future years
        for (int i = 1; i < LINE_YEARS; i++) {
            for (int j = 0; j < COL_RATES; j++) {
                // get last year's balances from previous row
                double oldBalance = balances[i - 1][j];

                // compute interest
                double interest = oldBalance * interestRate[j];

                // compute this year's balance
                balances[i][j] = oldBalance + interest;
            }
        }

        // print one row of interest rates
        for (int i = 0; i < COL_RATES; i++)
            System.out.printf("%9.0f%%", 100 * interestRate[i]);

        System.out.println();

        // print balance table
        for (double[] row : balances) {
            // print table row
            for (double b : row)
                System.out.printf("%10.2f", b);

            System.out.println();
        }
    }
}
