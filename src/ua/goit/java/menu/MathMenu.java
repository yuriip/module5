package ua.goit.java.menu;

import ua.goit.java.math.Math;

public class MathMenu {
    public static void processFindMaxValue(int[] array) {

        System.out.println("Максимальный элемент в массиве из целых чисел равен " + Math.max(array));
    }

    public static void processFindMinValue(int[] array) {
        System.out.println("Минимальный элемент в массиве из целых чисел равен " + Math.min(array));
    }

    public static void processSortArray(int[] array) {
        array = Math.sortArray(array);
        System.out.println("Сортировка массива по алгоритму пузырьковой сортировки выполнена");
        for (int a : array) {
            System.out.println("a = " + a);
        }
    }

    public static void processSortMergeArray(int[] array) {
        array = Math.sortMergeArray(array);
        System.out.println("Сортировка массива по алгоритму слияния выполнена");
        for (int a : array) {
            System.out.println("a = " + a);
        }
    }
}
