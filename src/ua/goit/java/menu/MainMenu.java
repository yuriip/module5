package ua.goit.java.menu;

import ua.goit.java.controller.InputController;
import ua.goit.java.math.Math;

public class MainMenu {
    public static void processMenu() throws Exception {

        int bound = InputController.inputDataInt("Введите верхнюю границу диапазона в котором будут генерироваться случайные числа\n");
        int n = InputController.inputDataInt("Введите размер массива, который будет заполнен случайными числами в диапазоне от -" + bound + " до " + bound + "\n");
        Math math = new Math();
        int[] array = null;
        array = math.createRandomArray(n, bound);
        if (array == null) {
            Exception e = new Exception();
            throw e;
        }
        int[] arrayCopy = array.clone();

        while (true) {
            System.out.println("Исходный массив целих чисел:");
            for (int a : array) {
                System.out.println("a = " + a);
            }
            System.out.println("Поиск максимального элемента в массиве из целых чисел - введите 1");
            System.out.println("Поиск минимального элемента в массиве из целых чисел - введите 2");
            System.out.println("Сортировка массива (алгоритм пузырьковой сортировки) - введите 3");
            System.out.println("Сортировка массива (алгоритм слияния) - введите 4");
            System.out.println("Выход из программы - введите 0");

            String str = InputController.br.readLine();
            switch (str) {
                case "1":
                    MathMenu.processFindMaxValue(arrayCopy);
                    System.out.println();
                    break;
                case "2":
                    MathMenu.processFindMinValue(arrayCopy);
                    System.out.println();
                    break;
                case "3":
                    MathMenu.processSortArray(arrayCopy);
                    System.out.println();
                    break;
                case "4":
                    MathMenu.processSortMergeArray(arrayCopy);
                    System.out.println();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("!!! Выбор не сделан, попробуйте еще раз !!!");
            }
        }
    }
}
