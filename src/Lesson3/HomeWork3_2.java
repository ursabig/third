package Lesson3;//Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//maybe a and b are even - если сумма переменных четная
//some variable is odd - если сумма переменных нечетная


public class HomeWork3_2 {
    public static void main(String[] args) {

        int a = 31;
        int b = 19;
        int result = (a + b) % 2;

        if (result > 0) {
            System.out.println("some variable is odd");
        } else {
            System.out.println("maybe a and b are even");
        }

    }
}
