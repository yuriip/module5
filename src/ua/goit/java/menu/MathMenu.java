package ua.goit.java.menu;

import ua.goit.java.math.Math;

public class MathMenu {
    public static void processFindMaxValue() {
        System.out.println("Максимальный элемент в массиве из целых чисел равен " + Math.max());
    }

    public static void processFindMinValue() {
        System.out.println("Минимальный элемент в массиве из целых чисел равен " + Math.min());
    }

    public static void processSortArray() {
        Math.sortArray();
        System.out.println("Сортировка массива по алгоритму пузырьковой сортировки выполнена");
    }
}
