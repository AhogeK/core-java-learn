package ahogek.com.github.lambda;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author AhogeK ahogek@gmail.com
 * @since 2022-06-09 19:56:08
 */
public class RequireNonNullOrElseGetTest {

    public static void main(String[] args) {
        var testDate = Objects.requireNonNullElse(null, LocalDate.of(1970, 1, 1));
        System.out.println(testDate);
        var testDate2 = Objects.requireNonNullElseGet(null, () -> LocalDate.of(1970, 1, 1));
        System.out.println(testDate2);
    }
}
