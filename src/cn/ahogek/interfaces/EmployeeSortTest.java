package cn.ahogek.interfaces;

import java.util.Arrays;

/**
 * This program demonstrates the use of the {@link Comparable} interface
 *
 * @author AhogeK cn@gmail.ahogek
 * @since 2022-06-08 12:48:09
 */
public class EmployeeSortTest {

    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println(e);
        }
    }
}
