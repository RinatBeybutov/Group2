package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        /**
         * Дано множество (Set) целых чисел и целевое число. Найдите все уникальные пары чисел,
         * сумма которых равна заданному числу.
         *
         * Пример:
         *
         * Вход: [1, 2, 3, 4, 5, 6], целевое число: 6
         * Выход: [(1, 5), (2, 4)]
         */

        Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6);
        int target = 6;
        Set<List<Integer>> collect = set.stream()
                .filter(number -> set.contains(target - number) && number != target - number)
                .map(num -> Arrays.asList(num, target - num))
                .peek(Collections::sort)
                .collect(Collectors.toSet());

        System.out.println();


    }
}
