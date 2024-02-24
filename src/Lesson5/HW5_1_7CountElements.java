package Lesson5;//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести количество элементов в массиве.


public class HW5_1_7CountElements {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println("длина верхнеуровневого массива: " + array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length);
        }
    }
}
