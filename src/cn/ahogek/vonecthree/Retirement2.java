package cn.ahogek.vonecthree;

import java.util.Scanner;

/**
 * This program demonstrates a <code>do/while</code> loop.
 *
 * @author AhogeK ahogek@gmail.com
 * @since 2022-07-12 16:06:11
 */
public class Retirement2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        // update account balance while user isn't read to retire
        do {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            // print current balance
            System.out.printf("After year %d, your balance is %,.2f%n", year, balance);

            // ask if ready to retire and get input
            System.out.println("Ready to retire? (Y/N) ");
            input = in.next();
        } while (input.equals("N"));
    }
}
