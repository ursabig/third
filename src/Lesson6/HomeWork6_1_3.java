package Lesson6;//Дан массив:
//String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

import java.util.Arrays;

public class HomeWork6_1_3 {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java" }};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            String s = Arrays.toString(array[i]);
            if (s.contains("е")) {
            } else {
              count++;
            }
        }
        System.out.println(count);
    }
}
