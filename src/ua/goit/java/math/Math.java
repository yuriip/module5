package ua.goit.java.math;

import java.util.Random;

public class Math {
    public final static int BOUND = 100;
    public final static int IS_EVEN = 2;

    private static int[] array;

    public static int[] getArray() {
        return array;
    }

    public static void setArray(int n) {
        array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(BOUND);
            if ((i % IS_EVEN) == 0) {
                array[i] = array[i] * (-1);
            }
        }
    }

    public static int max() {
        int max = Integer.MIN_VALUE;

        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static int min() {
        int min = Integer.MAX_VALUE;

        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static void sortArray() {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }
}
