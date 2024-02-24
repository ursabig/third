package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {

        int [] arr = {1, 2, 0, 4, 3, 11};
//        int max = 0;
//        int max1 = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max1) {
//                max1 = arr[i];
//            }
//        }
//        System.out.println(max1);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum; // sum += arr[i]
        }
        System.out.println(sum);
    }
}
//
//одновременно переименовать переменную везде - shift+f6
