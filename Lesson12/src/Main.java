import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Hash от ключа с номером ячейки массива?
        int a = 12354354;
        HashMap<Integer, String> map = new HashMap<>();

        // Вставка O(1) сразу, O(n) - список в бакете, O(log n) - дерево в бакете

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "one");
        map.put(6, "two");
        map.put(7, "three");
        map.put(8, "four");
        map.put(9, "one");
        map.put(10, "two");
        map.put(11, "three");
        map.put(12, "four");
        map.put(13, "four");
        map.put(14, "four");
        map.put(15, "four");


        System.out.println(map.size());


    }

    public static void test() {
        /**
         * Разработать программу для анализа текста
         *
         * Задача:
         * Создайте программу, которая анализирует текст и выполняет следующие действия:
         *
         * Выводит уникальные слова.
         * Находит и выводит самые часто встречающиеся слова.
         * Считает и выводит частоту встречаемости каждого слова.
         *
         * Требования к реализации:
         *
         * Программа должна считывать текст из файла или консоли.
         * Используйте HashMap для подсчета частоты слов. Ключ — слово, значение — количество его вхождений.
         * Для вывода уникальных слов используйте Set.
         * Реализуйте метод для нахождения самых часто встречающихся слов.
         *
         * Пример работы программы:
         *
         * Введите текст:
         * "Это пример текста. Текст содержит слова, которые повторяются. Например, текст."
         * 1. Уникальные слова: [Это, пример, текста, Текст, содержит, слова, которые, повторяются, Например]
         * 2. Самые частые слова: [текст: 3]
         * 3. Частота слов:
         * Это: 1
         * пример: 1
         * текста: 1
         * Текст: 2
         * содержит: 1
         * слова: 1
         * которые: 1
         * повторяются: 1
         * Например: 1
         */

        String text = "1111Это пример текста. Текст содержит слова, которые повторяются. Например, текст.";

        //String[] examples = text.split(" ");
        String s = text.replaceAll("[^а-яА-Я]", " ").trim();
        String[] split = s.split(" {1,}");

        HashMap<String, Integer> map = new HashMap<>();

        for (String s1 : split) {
            if (map.containsKey(s1)) {
                map.put(s1, map.get(s1) + 1);
            } else {
                map.put(s1, 1);
            }
        }

        System.out.println(Arrays.toString(split));
    }

    public static void test2(HashMap<String, Integer> wordCountMap) {
        int maxCount = 0;
        String maxWord = "";

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }

        System.out.printf("Самое частое слово: %s, встречается %d раз\n", maxWord, maxCount);
    }
}