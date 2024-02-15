import org.w3c.dom.ls.LSOutput;

/**
 тело метода заключается в фигурные скобки
 */

public class Lesson6_2 {

    public static void printString (String str) {
        System.out.println(str);
    }

    public static void sum (int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        String s = "Hello world!";

//        printString("Helen");

        /**
         * в круглых скобках после имени метода передаются параметры
         * значение параметра определяется перед вызовом метода (переменной (параметра) внутри метода)
         */
//
//        sum(3, 7);
//        sum(15, 48);

        System.out.println(getSum(48, 95));

    }

    public static int getSum(int a, int b) {
    return a + b;
    }
    int x = getSum(6, 9);

}

