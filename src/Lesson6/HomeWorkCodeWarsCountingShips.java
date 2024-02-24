package Lesson6;

import java.lang.reflect.Array;

public class HomeWorkCodeWarsCountingShips {
    public static void main(String[] args) {

        System.out.println(countingSheep(5));
    }

    public static String countingSheep(int num) {
        //Add your code here
        String result = "";
        for (int i = 1; i <= num; i++) {
            result = result + i + " sheep...";
        }
        return result;
    }
}
