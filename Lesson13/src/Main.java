import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Стримы
        printNums8();

    }

    public static void printNums1() {
        for (int i = 0; i < 20; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNums2() {
        Stream.iterate(0, i -> i + 1)
                .limit(20)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }

    /**
     * 1 2 2
     */
    public static void printNums3() {
        Stream.of(1, 2, 3, 4, 5)
                .peek(System.out::println)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println)
                .findFirst();
    }

    // map d2 , map A1 , map B1 .. map C, Match A1 ?
    // map d2, match D2, map a1, Match A1
    public static void printNums4() {
        boolean result = Stream.of("d2", "a1", "b1", "b3", "c")
                .map(string -> {
                    System.out.println("map " + string);
                    return string.toUpperCase();
                })
                .anyMatch(string -> {
                    System.out.println("Match " + string);
                    return string.startsWith("A");
                });
    }

    public static void printNums5() {
        List<Integer> x1 = List.of(1,2,3);
        List<Integer> x2 = List.of(4,5,6);
        List<Integer> x3 = List.of();

        Stream.of(x1,x2,x3)
                .flatMap(Collection::stream)
                .map(x -> x+1)
                .forEach(System.out::print);
        // 234567
    }

    public static void printNums6() {
        Stream.of("C", "A", "B")
                .sorted(Comparator.reverseOrder())
                .filter(str -> {
                    //System.out.println(str);
                    return str.startsWith("A");
                })
                .peek(System.out::println)
                .toList();
    }

    public static void printNums7() {
        int sum = IntStream.of(1, 2, 3, 4)
                .sum();

        LongStream sum2 = LongStream.of(1, 2, 3, 4);
    }

    public static void printNums8() {
        DoubleStream s = DoubleStream.of(1.2, 2.4);
        long count = s
                .peek(System.out::println)
                .filter(x -> x > 2)
                .count();
        System.out.println(count);
    }
}