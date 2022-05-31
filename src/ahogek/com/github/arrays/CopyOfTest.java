package ahogek.com.github.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 这个程序用于展示数组的基础拷贝操作
 *
 * @author AhogeK ahogek@gmail.com
 * @since 2022-05-31 22:06:54
 */
public class CopyOfTest {

    /**
     * 这个方法将一个旧数组拷贝至一个新数组长度取a长度或比a长度小的新长度
     *
     * @param a         旧数组
     * @param newLength 新的长度
     * @return newLength 长度的 a 拷贝后的数组
     */
    public static Object[] badCopyOf(Object[] a, int newLength) {
        var newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    /**
     * 更好的拷贝方式
     *
     * @param a         旧数组对象
     * @param newLength 新数组长度
     * @return 拷贝后的数组
     */
    public static Object goodCopyOf(Object a, int newLength) {
        Class<?> cl = a.getClass();
        if (!cl.isArray()) {
            return null;
        }
        Class<?> componetType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componetType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }

    public static void main(String[] args) {
        String strArray[] = {"1", "2", "3"};
        String copy[];
        try {
            copy = (String[]) badCopyOf(strArray, 3);
            System.out.println(Arrays.toString(copy));
        } catch (ClassCastException e) {
            System.out.println("badCopyOf方法调用因为该拷贝方法返回的是一个 Object[] 数组，因此无法直接转换为 String[] 数组");
        }
        copy = (String[]) goodCopyOf(strArray, 3);
        System.out.println(Arrays.toString(copy));
    }
}
