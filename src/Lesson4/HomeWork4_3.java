package Lesson4;//Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//        Реализовать 2 варианта:
//использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//без использования конструкции if (шаг цикла на ваше усмотрение).


public class HomeWork4_3 {
    public static void main(String[] args) {

//way using if

//        int[] numbers = {40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60};
//
//        for (int i = 0; i <= 20; i = i + 1) {
//            if (numbers[i] % 4 == 0) {
//                System.out.println(numbers[i]);
//            }
//        }


        for (int i = 40; i <= 60; i = i + 4) {
            System.out.println(i);
        }
    }
}
