package ua.chnu.edu.kkn.patterns.revisited.startegy;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static int totalAllValues(List<Integer> values) {
        int result = 0;
        for (int number : values) {
            result += number;
        }
        return result;
    }

    public static int totalAllEvenValues(List<Integer> values) {
        int result = 0;
        for (int number : values) {
            if (number % 2 == 0) {
                result += number;
            }
        }
        return result;
    }

    // public static int totalAllOddValues(List<Integer> values)

    public static int totalAllValues(List<Integer> values, Predicate<Integer> selector) {
        int result = 0;
        for (int number : values) {
            if (selector.test(number)) {
                result += number;
            }
        }
        return result;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        var values = List.of(1, 2, 3, 4, 5, 6, 7);
        //System.out.println(totalAllValues(values));
        //System.out.println(totalAllEvenValues(values));
        //System.out.println(totalAllOddValues(values));

        System.out.println(totalAllValues(values, number -> true));
        System.out.println(totalAllValues(values, number -> number % 2 == 0));
        System.out.println(totalAllValues(values, number -> number % 2 != 0));
        System.out.println(totalAllValues(values, Main::isOdd));
    }
}
