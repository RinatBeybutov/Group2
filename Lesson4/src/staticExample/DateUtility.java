package staticExample;

import java.time.LocalDate;

public class DateUtility {

    public static LocalDate convertToLocalDate(String date) {
        return LocalDate.parse(date);
    }

}
