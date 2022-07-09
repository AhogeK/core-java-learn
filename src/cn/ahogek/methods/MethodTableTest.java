package cn.ahogek.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author AhogeK cn@gmail.ahogek
 * @since 2022-06-07 19:04:49
 */
public class MethodTableTest {

    /**
     * Returns the square of a number
     *
     * @param x a number
     * @return x squared
     */
    public static double square(double x) {
        return x * x;
    }

    /**
     * Prints a table with x- and y-values for a method
     *
     * @param from the lower bound for x-values
     * @param to   the upper bound for y-values
     * @param n    the number of rows int the table
     * @param f    a method with a double parameter and double return value
     * @throws InvocationTargetException invocation target exception
     * @throws IllegalAccessException    illegal access exception
     */
    public static void printTable(double from, double to, int n, Method f) throws InvocationTargetException, IllegalAccessException {
        // print out the method as table header
        System.out.println(f);

        double dx = (to - from) / (n - 1);

        for (double x = from; x <= to; x += dx) {
            double y = (Double) f.invoke(null, x);
            System.out.printf("%10.4f | %10.4f%n", x, y);
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // get method pointers to the square and sqrt methods
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        // print table of x- and y-values
        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }
}
