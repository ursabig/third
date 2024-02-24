package Lesson5;//int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//необходимо вывести среднее арифметическое всех значений массива.


public class HW5_1_4_Avg {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        int length = array.length;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / length;
        System.out.println(avg);
    }
}
