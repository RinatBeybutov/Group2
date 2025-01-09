import org.example.TrafficLight;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrafficLightTest {

    @ParameterizedTest(name = "{index} - Time = {0}, expected colour - {1}")
    @MethodSource("data")
    @DisplayName("Проверка светофора")
    void test(double input, String expected) {
        String actual = TrafficLight.getColour(input);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(2.5, "green"),
                Arguments.of(3.0, "yellow"),
                Arguments.of(4.5, "red"),
                Arguments.of(5.5, "green"),
                Arguments.of(8.0, "yellow"),
                Arguments.of(9.5, "red"));
    }
}
