package ua.goit.java.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputController {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int inputDataInt(String str) throws IOException {
        System.out.print(str);
        int res;

        while (true) {
            try {
                String str1 = br.readLine();
                res = Integer.parseInt(str1);
                break;
            } catch (NullPointerException | NumberFormatException e) {
                str = str.substring(0, str.length() - 1);
                System.out.println("!!! Ошибка. Необходимо ввести число. Попробуйте еще раз !!!");
                System.out.println("!!! " + str + " !!!");
            }
        }
        return res;
    }
}
