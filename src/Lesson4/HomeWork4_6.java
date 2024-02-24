//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо увеличить все значения массива на 15.

import java.util.Arrays;

public class HomeWork4_6 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i++) {
            int result = array[i] + 15;
            array[i] = result;
        }
        System.out.println(Arrays.toString(array));
    }
}