import org.example.CustomCalendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тестирование календаря")
class CalendarTest {

    @Test
    @DisplayName("Test 1600")
    void test1() {
        int actual = CustomCalendar.getdaysInYear(1600);
        int expected = 366;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test 1700")
    void test2() {
        int actual = CustomCalendar.getdaysInYear(1700);
        int expected = 365;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test 2004")
    void test3() {
        int actual = CustomCalendar.getdaysInYear(2004);
        int expected = 366;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test 2005")
    void test4() {
        int actual = CustomCalendar.getdaysInYear(2005);
        int expected = 365;

        assertEquals(expected, actual);
    }
}
