package ua.goit.java.menu;

import ua.goit.java.controller.InputController;
import ua.goit.java.math.Math;

public class MainMenu {
    public static void processMenu() throws Exception {

        int n = InputController.inputDataInt("Введите размер массива, который будет заполнен случайными числами в диапазоне от -100 до 100\n");
        Math.setArray(n);
        if (Math.getArray() == null) {
            Exception e = new Exception();
            throw e;
        }

        while (true) {
            System.out.println("Массив целих чисел:");
            for (int a : Math.getArray()) {
                System.out.println("a = " + a);
            }
            System.out.println("Поиск максимального элемента в массиве из целых чисел - введите 1");
            System.out.println("Поиск минимального элемента в массиве из целых чисел - введите 2");
            System.out.println("Сортировка массива - введите 3");
            System.out.println("Выход из программы - введите 0");

            String str = InputController.br.readLine();
            switch (str) {
                case "1":
                    MathMenu.processFindMaxValue();
                    System.out.println();
                    break;
                case "2":
                    MathMenu.processFindMinValue();
                    System.out.println();
                    break;
                case "3":
                    MathMenu.processSortArray();
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
