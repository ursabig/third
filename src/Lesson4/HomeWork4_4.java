//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести все нечетные числа из массива.


public class HomeWork4_4 {

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
