package Lesson4;

import java.util.Arrays;

public class Lesson4 {

    public static void main(String[] args) {

//        int a = 2;
//        int b = 8;

//        for (int i = 0 ; i < 5 ; i = i + 1) {
//            System.out.println("!!!");
//        }

        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(array));

//        поменять элемент массива, обратившись к нему по индексу
//        array[1] = 8;
//        System.out.println(array[1]);

        for (int i = 0; i < array.length; i = i + 1)
            System.out.println(array[i]);

//        СОЗДАТЬ МАССИВ С ОПРЕДЕЛЁННОЙ ДЛИНОЙ
        int[] array2 = new int[39];

        for (int i = 0; i < array2.length; i = i + 1) {
            array2[i] = 29;
            System.out.println(array2[i]);
        }

//        МАССИВ СО ВЛОЖЕННЫМ ИФОМ

        int[] array3 = {9, 10, 11, 12};
        for (int i = 0; i < array2.length; i = i + 1) {
          if (array3[i] % 2 == 0) {
              array3[i] = array3[i] * 10;
          }
        }
    }
}
