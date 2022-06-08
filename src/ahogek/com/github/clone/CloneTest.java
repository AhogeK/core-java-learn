package ahogek.com.github.clone;

import java.util.Calendar;

/**
 * This program demonstrates cloning
 *
 * @author AhogeK ahogek@gmail.com
 * @since 2022-06-07 19:21:29
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        var original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000, Calendar.JANUARY, 1);
        var copy = original.clone();
        copy.setHireDay(2002, Calendar.DECEMBER, 31);
        System.out.println("original= " + original);
        System.out.println("copy= " + copy);
    }
}
