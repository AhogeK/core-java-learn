package cn.ahogek.clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author AhogeK cn@gmail.ahogek
 * @since 2022-06-07 19:22:33
 */
public class Employee implements Cloneable {

    private String name;

    private double salary;

    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        // Call Object clone
        Employee cloned = (Employee) super.clone();

        // clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    /**
     * Set the hire day to a given date.
     *
     * @param year  the year of the hire day
     * @param month the month of the hire day
     * @param day   the day of the hire day;
     */
    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month, day).getTime();

        // example of instance field mutation
        hireDay.setTime(newHireDay.getTime());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
