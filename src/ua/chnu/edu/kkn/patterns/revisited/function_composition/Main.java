package ua.chnu.edu.kkn.patterns.revisited.function_composition;

import java.util.function.Function;

public class Main {

    public static void print(int number, String message, Function<Integer, Integer> func) {
        System.out.println(number + " " + message + " " + func.apply(number));
    }

    public static void main(String[] args) {
        Function<Integer, Integer> inc = number -> number + 1;
        print(5, "incremented", inc);
        print(6, "incremented", inc);
        Function<Integer, Integer> doubleIt = number -> number * 2;
        print(5, "doubled", doubleIt);
        print(6, "doubled", doubleIt);
        var incAndDoubleIt = inc.andThen(doubleIt);
        print(5, "incremented and doubled", incAndDoubleIt);
    }
}
