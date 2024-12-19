import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {

        /**
         * 1. Создай список слов, заполни его самостоятельно.
         * 2. Метод fix должен:
         * 2.1. удалять из списка строк все слова, содержащие букву "р"
         * 2.2. удваивать все слова содержащие букву "л". {лоза} -> {лоза, лоза} -> {лозалоза}
         * 2.3. если слово содержит и букву "р" и букву "л",
         * то оставить это слово без изменений.
         * 2.4. с другими словами ничего не делать.
         */
        List<String> fix = fix(List.of("роза", "лоза", "лира", "бокс"));
        fix.forEach(System.out::println);
    }

    public static List<String> fix(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("р") || s.contains("л"))
                .flatMap(s -> {
                    if (!s.contains("р") && s.contains("л")) {
                        return Stream.of(s, s);
                    }
                    return Stream.of(s);
                })
                .toList();
    }

    public static void printStrings(List<String> list) {
        if (list != null && list.isEmpty()) {
            System.out.println("СПисок пуст!");
            return;
        }

        list.forEach(System.out::println);
    }

    // Неправильное название!
    public void findMaxLengthString(List<String> list) {
        list.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst()
                .ifPresent(System.out::println);
    }

    public void printMaxLengthString(List<String> list) {
        int WORKING_DAYS = 4;
        // DtaRcrd102  = DataRecord102

        list.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
