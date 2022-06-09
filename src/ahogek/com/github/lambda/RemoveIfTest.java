package ahogek.com.github.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author AhogeK ahogek@gmail.com
 * @since 2022-06-09 19:53:12
 */
public class RemoveIfTest {

    public static void main(String[] args) {
        var strList = new ArrayList<>(Arrays.asList("test1", "test2", null, null, "test3", null, "test4"));
        /*
         * Same code like strList.removeIf(e -> e == null);
         */
        strList.removeIf(Objects::isNull);
        System.out.println(strList);
    }
}
