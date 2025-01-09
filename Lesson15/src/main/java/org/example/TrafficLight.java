package org.example;

// TrafficLight - Светофор
public class TrafficLight {

    /**
     * Работа светофора для пешеходов запрограммирована следующим образом:
     * в начале каждого часа в течение трех минут горит зелёный сигнал,
     * затем в течение одной минуты - жёлтый,
     * а потом в течение одной минуты - красный,
     * затем опять зелёный горит три минуты и т. д.
     * Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
     * Определить, сигнал какого цвета горит для пешеходов в этот момент.
     * Результат вывести на экран в следующем виде:
     * "зелёный" - если горит зелёный цвет,
     * "жёлтый" - если горит жёлтый цвет,
     * "красный" - если горит красный цвет.
     *
     * Пример для числа 2.5:
     * зелёный
     *
     * Пример для числа 3:
     * жёлтый
     *
     * Пример для числа 4:
     * красный
     *
     * Пример для числа 5:
     * зелёный
     */

    /**
     * [0 .. 3) - green
     * [3 .. 4) - yellow
     * [4 .. 5) - red
     */
    public static String getColour(double time) {
        //Integer.valueOf()
        double reminder = time % 5;
        if(reminder < 3) {
            return "green";
        } else if(reminder < 4) {
            return "yellow";
        } else if (reminder < 5) {
            return "red";
        }
        return "green";
    }
}