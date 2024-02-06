//Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.

public class HomeWork4_2 {
    public static void main(String[] args) {

        int five = 5;
        for (int i = 1; i < 10000; i = i + 1) {
            int degree = five * i;
            System.out.println(degree);
        }
    }
}
