package ua.goit.java.math;

import java.util.Random;

public class Math {

    public int[] createRandomArray(int n, int bound) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2 * bound) - bound;
        }
        return array;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static int[] sortArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        return array;
    }

    public static int[] sortMergeArray(int[] array) {
        sortMergeArray(array, 0, array.length - 1);
        return array;
    }

    private static void sortMergeArray(int[] array, int part1, int part2) {
        if (part1 >= part2) {
            return;
        }

        int part3 = (part1 + part2) / 2;
        sortMergeArray(array, part1, part3);
        sortMergeArray(array, part3 + 1, part2);
        sortMergeArray(array, part1, part3, part2);
    }

    private static void sortMergeArray(int[] array, int part1, int part3, int part2) {
        if (part3 + 1 > part2) {
            return;
        }

        int[] arrayTemp = new int[array.length];
        for (int i = part1; i <= part3; i++) {
            arrayTemp[i] = array[i];
        }

        for (int i = part3 + 1; i <= part2; i++) {
            int j = part2 + part3 + 1 - i;
            arrayTemp[i] = array[j];
        }

        for (int i = part1, j = part1, k = part2; i <= part2; i++) {
            if (arrayTemp[j] <= arrayTemp[k]) {
                array[i] = arrayTemp[j++];
            } else {
                array[i] = arrayTemp[k--];
            }
        }
    }
}
