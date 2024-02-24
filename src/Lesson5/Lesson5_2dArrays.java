import java.util.Arrays;
import java.util.List;

public class Lesson5_2dArrays {

    public static void main(String[] args) {

//// пример двумерного массива
//        int [][] array = {
//                {4, 5, 6},
//                {1, 2, 3, 11},
//                {7, 8, 9, 1, 45}
//        };
//
//// как обратиться к элементу массива со вложенным массивом (вернет 11)
////        System.out.println(array[1][3]);

        int[][] array2 =
                {
                        {4, 5, 6},
                        {1, 2, 3, 11},
                        {7, 8, 9, 1, 45}
                };


        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] > max) {
                    max = array2[i][j];
                }
            }
        }
        System.out.println(max);
    }
}

/* break прерывает ВЕСЬ ЦИКЛ и идёт в конец
continue прерывает ОДНУ ИТЕРАЦИЮ и возвращает к началу цикла
 */

/*
массив - это ссылочный тип, reference type
внутри себя такой тип хранит ссылку на объект
 */