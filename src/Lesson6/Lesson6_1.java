package Lesson6;

/** как вызвать инфу о методе?
 установить курсор на метод, затем нажать ctrl + q
 */

public class Lesson6_1 {
    public static void main(String[] args) {

        String s = "Hello world!";
        System.out.println(s.toLowerCase());

        String sU = s.toUpperCase();
        System.out.println(sU);

        int wIndex = s.indexOf("w");
        System.out.println(wIndex);

        String subst = s.substring(6, 9);
        System.out.println(subst);

        /**
        строки в java immutable, то есть неизменяемые
         */
        String subst1 = s.replace("ll", "O_O");
        System.out.println(subst1);

        char c = '5';

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

        }
    }
}
