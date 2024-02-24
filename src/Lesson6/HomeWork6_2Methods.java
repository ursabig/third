//Необходимо написать 4 метода:
//сложение 2х чисел
//вычитание 2х чисел
//умножение 2х чисел
//деление 2х чисел


public class HomeWork6_2Methods {

    public static void main(String[] args) {
        System.out.println("It's alive! Alive");

        int x = getSum(5, 12);

        System.out.println(getSum(15, 12));
        System.out.println(x);

        System.out.println(getMinus(58, 48));
        System.out.println(getMinus(158, 596));

        System.out.println(getIncrement(2, 7));

        System.out.println(getDecrement(48, 13));
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getMinus(int c, int d) {
        return c - d;
    }

    public static int getIncrement (int e, int f) {
        return e * f;
    }

    public static float getDecrement(float g, float i) {
        return g / i;
    }
}
