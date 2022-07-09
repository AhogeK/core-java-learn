package cn.ahogek.lambda;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * This program demonstrates the use of lambda expressions
 *
 * @author AhogeK cn@gmail.ahogek
 * @since 2022-06-09 19:45:26
 */
public class LambdaTest {

    public static void main(String[] args) {
        var planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(planets));

        var timer = new Timer(1000, event -> {
            System.out.println("This time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        });
        timer.start();

        // keep program running until user select "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
