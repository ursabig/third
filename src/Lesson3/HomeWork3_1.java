package Lesson3;//HW
//
//Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
//a == b - если переменные равны
//a < b - если переменная a меньше b
//a > b - если переменная b меньше a

public class HomeWork3_1 {

    public static void main(String[] args) {

        int a = 32;
        int b = 19;

        if (a == b) {
            System.out.println(a + " равно " + b);
        }
            else if (a < b) {
                System.out.println("А меньше Б");
            }
            else {
            System.out.println("А больше Б");
        }
    }
}
