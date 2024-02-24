package Lesson6;

import java.lang.reflect.Array;

public class HomeWorkCodeWarsSecond {

    public static void main(String[] args) {
        int[] arr = {46, 15, -6, 22, 35};
        System.out.println(findSmallestInt(arr));
    }

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }
}